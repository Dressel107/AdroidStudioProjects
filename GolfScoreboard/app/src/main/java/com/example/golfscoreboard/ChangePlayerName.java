package com.example.golfscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePlayerName extends AppCompatActivity implements View.OnClickListener{

    Button nameAendern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_player_name);

        nameAendern = findViewById(R.id.nameaendern);
        nameAendern.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        EditText input = (EditText) findViewById(R.id.playerNameInput);
        String newName = input.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("newName", newName);
        setResult(RESULT_OK, intent);
        finish();
    }
}