package com.example.tabletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    TableLayout tableLayout;
    TableRow tableRow1, tableRow2;
    Button b1,b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tableLayout = new TableLayout(this);
        tableRow1 = new TableRow(this);
        tableRow2 = new TableRow(this);

        b1 = new Button(this);
        b2 = new Button(this);
        b3 = new Button(this);
        b4 = new Button(this);
        b5 = new Button(this);

        TableLayout.LayoutParams lp = new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        tableLayout.setLayoutParams(lp);
        b1.setText("Text 1");
        b2.setText("Text 2");
        b3.setText("Text 3");
        b4.setText("Text 4");
        b5.setText("Text 5");

        tableRow1.addView(b1);
        tableRow1.addView(b2);
        tableRow1.addView(b3);
        tableRow2.addView(b4);
        tableRow2.addView(b5);

        tableLayout.setColumnStretchable(0, true);
        tableLayout.setColumnStretchable(1, true);
        tableLayout.setColumnStretchable(2, true);

        tableLayout.addView(tableRow1);
        tableLayout.addView(tableRow2);


        setContentView(tableLayout);
    }
}