package com.example.golfscoreboard;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;


import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TableLayout tableLayout;

    Button currentBtn;



    ActivityResultLauncher<Intent> startForPlayerName = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result != null && result.getResultCode() == RESULT_OK){
                if(result.getData() != null){
                    currentBtn.setText(result.getData().getStringExtra("newName"));
                    //int test  = Integer.parseInt(currentBtn.getText().toString()) ;
                }
            }
        }
    });

    ActivityResultLauncher<Intent> startForPoints = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result != null && result.getResultCode() == RESULT_OK){
                if(result.getData() != null){
                    currentBtn.setText(result.getData().getStringExtra("points"));

                }
            }
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();


        Intent intent = getIntent();

        int anzahlSpieler = Integer.parseInt(intent.getStringExtra("anzahlSpieler"));
        int anzahlLöcher = Integer.parseInt(intent.getStringExtra("anzahlLöcher"));
        String platzName = intent.getStringExtra("platzname");

        this.tableLayout = createTable(anzahlLöcher,anzahlSpieler, platzName);


        setContentView(tableLayout);


    }


    @Override
    public void onClick(View v) {

    }

    private void getResultPlayerName(){
        Intent intent = new Intent(this, ChangePlayerName.class);
        startForPlayerName.launch(intent);
    }

    private void getResultHolePoints(){
        Intent intent = new Intent (this, ChosePoints.class);
        startForPoints.launch(intent);
    }


    private void restartGame(){
        Intent intent = new Intent(this, Start.class);
        startActivity(intent);
    }

    private TableLayout createTable(int holeNo, int playerNo, String platzName){
        TableLayout mainTable = new TableLayout(this);
        mainTable.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 1.0f));

        TableRow toolbar = new TableRow(this);
        toolbar.setBackgroundColor(Color.GRAY);
        toolbar.setPadding(15,15,15,15);



        TextView spielname = new TextView(this);
        spielname.setText(platzName);
        spielname.setTextColor(Color.WHITE);
        spielname.setTextSize(25);
        toolbar.addView(spielname);

        ImageView refresh = new ImageView(this);
        refresh.setBackgroundResource(R.drawable.ic_baseline_refresh_24);
        refresh.setScaleX(0.4F);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartGame();
            }
        });

        toolbar.addView(refresh);


        mainTable.addView(toolbar);

        TableRow header = new TableRow(this);

        Button btn0 = new Button(this);
        btn0.setBackgroundResource(R.drawable.green2button);
        btn0.setText("Hole");
        btn0.setTextColor(Color.WHITE);
        header.addView(btn0);

        for(int i = 0; i < playerNo; i++){
            Button btn = new Button(this);
            btn.setBackgroundResource(R.drawable.green2button);
            btn.setText("Sp" + (i + 1));
            btn.setTextColor(Color.WHITE);
            header.addView(btn);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    currentBtn = (Button) v;
                    getResultPlayerName();

                }
            });
        }
        mainTable.addView(header);

        for(int i = 0; i < holeNo; i++){
            TableRow row = new TableRow(this);
            Button btn = new Button(this);
            btn.setBackgroundResource(R.drawable.green1button);
            btn.setText(""+(i+1));
            btn.setTextColor(Color.WHITE);
            row.addView(btn);


            for (int j = 1; j <= playerNo; j++){
                Button btn1 = new Button(this);
                btn1.setBackgroundResource(R.drawable.normalbutton);
                btn1.setText("");
                btn1.setTextColor(Color.BLACK);
                row.addView(btn1);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        currentBtn = (Button) v;
                        getResultHolePoints();

                    }
                });
                TableLayout.LayoutParams rowParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f);
                row.setLayoutParams(rowParams);
            }
            mainTable.addView(row);
        }

        TableRow footer = new TableRow(this);
        Button btnfooter = new Button(this);
        btnfooter.setBackgroundResource(R.drawable.green2button);
        btnfooter.setText("Total");
        btnfooter.setTextColor(Color.WHITE);
        footer.addView(btnfooter);

        for(int i = 0; i < playerNo; i++){
            Button btn = new Button(this);
            btn.setBackgroundResource(R.drawable.green2button);
            btn.setText("");
            btn.setTextColor(Color.WHITE);
            footer.addView(btn);
        }
        mainTable.addView(footer);

        mainTable.setStretchAllColumns(true);
        mainTable.setShrinkAllColumns(true);


        return mainTable;
    }



}