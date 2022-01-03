package com.example.golfscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChosePoints extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_points);

        btn1 = findViewById(R.id.point1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.point2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.point3);
        btn3.setOnClickListener(this);

        btn4 = findViewById(R.id.point4);
        btn4.setOnClickListener(this);

        btn5 = findViewById(R.id.point5);
        btn5.setOnClickListener(this);

        btn6 = findViewById(R.id.point6);
        btn6.setOnClickListener(this);

        btn7 = findViewById(R.id.point7);
        btn7.setOnClickListener(this);

        btn8 = findViewById(R.id.point8);
        btn8.setOnClickListener(this);

        btn9 = findViewById(R.id.point9);
        btn9.setOnClickListener(this);

        btn10 = findViewById(R.id.point10);
        btn10.setOnClickListener(this);

        btn11 = findViewById(R.id.point11);
        btn11.setOnClickListener(this);

        btn12 = findViewById(R.id.point12);
        btn12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.point1:
                givePoints(1);
                break;
            case R.id.point2:
                givePoints(2);
                break;
            case R.id.point3:
                givePoints(3);
                break;
            case R.id.point4:
                givePoints(4);
                break;
            case R.id.point5:
                givePoints(5);
                break;
            case R.id.point6:
                givePoints(6);
                break;
            case R.id.point7:
                givePoints(7);
                break;
            case R.id.point8:
                givePoints(8);
                break;
            case R.id.point9:
                givePoints(9);
                break;
            case R.id.point10:
                givePoints(10);
                break;
            case R.id.point11:
                givePoints(11);
                break;
            case R.id.point12:
                givePoints(12);
                break;
            default:
                break;
        }
    }

    private void givePoints(int points){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("points", Integer.toString(points));
        setResult(RESULT_OK, intent);
        finish();
    }

}