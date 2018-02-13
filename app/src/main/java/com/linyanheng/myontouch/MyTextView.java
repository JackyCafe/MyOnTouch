package com.linyanheng.myontouch;


import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import org.xml.sax.Attributes;


/**
 * Created by linyanheng on 2018/2/13.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView {
    String TAG = "Jacky";

// default constructor
    public MyTextView(Context context) {
        super(context);
    }


    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"MyTextView dispatchTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"MyTextView dispatchTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG,"MyTextView dispatchTouchEvent ACTION_UP");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG,"MyTextView dispatchTouchEvent ACTION_CANCEL");
                break;
             default: break;

        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"MyTextView onTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"MyTextView onTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG,"MyTextView onTouchEvent ACTION_UP");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG,"MyTextView onTouchEvent ACTION_CANCEL");
                break;
            default: break;

        }
        return super.onTouchEvent(event);
    }
}
