package crc640cbed5f9e34be698;


public class AlphaPatternDrawable
	extends android.graphics.drawable.Drawable
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onBoundsChange:(Landroid/graphics/Rect;)V:GetOnBoundsChange_Landroid_graphics_Rect_Handler\n" +
			"n_setAlpha:(I)V:GetSetAlpha_IHandler\n" +
			"n_setColorFilter:(Landroid/graphics/ColorFilter;)V:GetSetColorFilter_Landroid_graphics_ColorFilter_Handler\n" +
			"n_getOpacity:()I:GetGetOpacityHandler\n" +
			"";
		mono.android.Runtime.register ("MonoDroid.ColorPickers.AlphaPatternDrawable, TEditor", AlphaPatternDrawable.class, __md_methods);
	}


	public AlphaPatternDrawable ()
	{
		super ();
		if (getClass () == AlphaPatternDrawable.class)
			mono.android.TypeManager.Activate ("MonoDroid.ColorPickers.AlphaPatternDrawable, TEditor", "", this, new java.lang.Object[] {  });
	}

	public AlphaPatternDrawable (int p0)
	{
		super ();
		if (getClass () == AlphaPatternDrawable.class)
			mono.android.TypeManager.Activate ("MonoDroid.ColorPickers.AlphaPatternDrawable, TEditor", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public void onBoundsChange (android.graphics.Rect p0)
	{
		n_onBoundsChange (p0);
	}

	private native void n_onBoundsChange (android.graphics.Rect p0);


	public void setAlpha (int p0)
	{
		n_setAlpha (p0);
	}

	private native void n_setAlpha (int p0);


	public void setColorFilter (android.graphics.ColorFilter p0)
	{
		n_setColorFilter (p0);
	}

	private native void n_setColorFilter (android.graphics.ColorFilter p0);


	public int getOpacity ()
	{
		return n_getOpacity ();
	}

	private native int n_getOpacity ();

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
