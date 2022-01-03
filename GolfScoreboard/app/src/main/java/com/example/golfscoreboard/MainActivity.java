package com.example.golfscoreboard;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn2;
    Button btn3;
    Button btn4;
    String textresults;
    Button currentBtn;

    ActivityResultLauncher<Intent> startForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result != null && result.getResultCode() == RESULT_OK){
                if(result.getData() != null){
                    setNamePlayer(result.getData().getStringExtra("newName"), currentBtn);

                }
            }
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);
    }



    private void setNamePlayer(String newName, View v){
        Button button = (Button) v;
        button.setText(newName);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                currentBtn = btn2;
                getResults();
                break;
            case R.id.button3:
                currentBtn = btn3;
                getResults();
                break;
            case R.id.button4:
                currentBtn = btn4;
                getResults();
                break;
            default:
                break;
        }
    }

    private void getResults(){
        Intent intent = new Intent(this, ChangePlayerName.class);
        startForResult.launch(intent);
    }
}