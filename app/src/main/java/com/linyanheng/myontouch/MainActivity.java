package com.linyanheng.myontouch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{

    private MyTextView myTextView;
    String TAG = "Jacky";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (MyTextView) findViewById(R.id.my_text_view);
        myTextView.setOnClickListener(this);
        myTextView.setOnTouchListener(this);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG,"Activity dispatchTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"Activity dispatchTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG,"Activity dispatchTouchEvent ACTION_UP");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG,"Activity dispatchTouchEvent ACTION_CANCEL");
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
                Log.d(TAG,"Activity onTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.d(TAG,"Activity onTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG,"Activity onTouchEvent ACTION_UP");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG,"Activity onTouchEvent ACTION_CANCEL");
                break;
            default: break;

        }
        return super.onTouchEvent(event);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.my_text_view:
                Log.d(TAG,"Activity on Click");
                break;
            default:
                break;
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.my_text_view:
                    switch (event.getAction()){
                        case MotionEvent.ACTION_DOWN:
                             Log.d(TAG, "Activity onTouchEvent ACTION_DOWN");
                              break;

                        case MotionEvent.ACTION_MOVE:
                                Log.d(TAG, "Activity onTouchEvent ACTION_MOVE");
                                break;

                        case MotionEvent.ACTION_UP:
                                Log.d(TAG, "Activity ßonTouchEvent ACTION_UP");
                                break;
                }

            break;

            default: break;
        }

        return false;
    }
}
