using APP_KTRA_ROUTER.Global;
using APP_KTRA_ROUTER.Models;
using Newtonsoft.Json;
using Rg.Plugins.Popup.Extensions;
using Rg.Plugins.Popup.Pages;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace APP_KTRA_ROUTER.Popup
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Cbox_Tram : PopupPage
    {
        TaskCompletionSource<TRAM> _tsk = null;
        public ObservableCollection<TRAM> _ListTram { get; set; }
        public Cbox_Tram(string ma_dien_luc)
        {
            InitializeComponent();
            var _json = Config.client.GetStringAsync(Config.URL + "api/home/GET_TRAM?donvi=" + Xamarin.Essentials.Preferences.Get(Config.DonVi, "") + "&ma_dien_luc=" + ma_dien_luc).Result;
            _json = _json.Replace("\\r\\n", "").Replace("\\", "");
            Int32 from = _json.IndexOf("[");
            Int32 to = _json.IndexOf("]");
            string result = _json.Substring(from, to - from + 1);
            ObservableCollection<TRAM> listTram = JsonConvert.DeserializeObject<ObservableCollection<TRAM>>(result);
            listViewTram.ItemsSource =_ListTram= listTram;
        }
        public async Task<TRAM> Show()
        {
            _tsk = new TaskCompletionSource<TRAM>();
            await Navigation.PushPopupAsync(this);
            return await _tsk.Task;
        }
         
        private async void listTram_ItemSelected(object sender, SelectedItemChangedEventArgs e)
        {
            TRAM _tram = e.SelectedItem as TRAM;
            await Navigation.PopAllPopupAsync(true);
            _tsk.SetResult(_tram);
        }

        private void search_TextChanged(object sender, TextChangedEventArgs e)
        {
            string matram = search.Text;
            if (matram != "")
            {
                listViewTram.ItemsSource = _ListTram.Where(p => p.MA_TRAM.ToLower().Contains(matram.ToLower()) || p.TEN_TRAM.ToLower().Contains(matram.ToLower())).ToList();
            }
            else
            {
                listViewTram.ItemsSource = _ListTram ;
            }
        }

        private async void TapGestureRecognizer_Tapped(object sender, EventArgs e)
        {
            await Navigation.PopAllPopupAsync(true);
        }
    }
}