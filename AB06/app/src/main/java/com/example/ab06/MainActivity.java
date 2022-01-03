package com.example.ab06;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    private ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new ImageView(this);
        view.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent e) {
        Log.d("Debug:", "MainActivity as Listener handles touchEvent");
        if(e.getActionMasked() == MotionEvent.ACTION_DOWN) {
            this.machWas(); //kann aufgerufen werden
        }
        return false;
    }

    public void machWas() {

    }
}