package crc640cbed5f9e34be698;


public class ColorPickerDialog
	extends android.app.Dialog
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSaveInstanceState:()Landroid/os/Bundle;:GetOnSaveInstanceStateHandler\n" +
			"n_onRestoreInstanceState:(Landroid/os/Bundle;)V:GetOnRestoreInstanceState_Landroid_os_Bundle_Handler\n" +
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MonoDroid.ColorPickers.ColorPickerDialog, TEditor", ColorPickerDialog.class, __md_methods);
	}


	public ColorPickerDialog (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ColorPickerDialog.class)
			mono.android.TypeManager.Activate ("MonoDroid.ColorPickers.ColorPickerDialog, TEditor", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.os.Bundle onSaveInstanceState ()
	{
		return n_onSaveInstanceState ();
	}

	private native android.os.Bundle n_onSaveInstanceState ();


	public void onRestoreInstanceState (android.os.Bundle p0)
	{
		n_onRestoreInstanceState (p0);
	}

	private native void n_onRestoreInstanceState (android.os.Bundle p0);


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
