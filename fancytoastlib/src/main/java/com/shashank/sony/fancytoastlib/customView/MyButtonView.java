package com.shashank.sony.fancytoastlib.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class MyButtonView extends androidx.appcompat.widget.AppCompatButton {
    public MyButtonView(Context context) {
        super(context);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }

    public MyButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }
}
