package com.example.golfscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Start extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        this.btn = findViewById(R.id.startspiel);
        this.btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        EditText editText1 = findViewById(R.id.anzahlspieler);
        EditText editText2 = findViewById(R.id.anzahllöcher);
        EditText editText3 = findViewById(R.id.platzname);

        String inputNuPlayer = editText1.getText().toString();
        String inputNuHoles = editText2.getText().toString();
        String platzname = editText3.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("anzahlSpieler", inputNuPlayer);
        intent.putExtra("anzahlLöcher", inputNuHoles);
        intent.putExtra("platzname", platzname);

        startActivity(intent);
    }
}