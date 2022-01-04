package com.example.golfscoreboard;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TableLayout tableLayout;
    TableRow tableRow;



    Button btn1, btn2, btn3, btn4, btn6, btn7, btn8, btn10, btn11, btn12, btn14, btn15, btn16, btn18, btn19, btn20,
            btn22, btn23, btn24, btn26, btn27, btn28, btn30, btn31, btn32, btn34, btn35, btn36, btn38, btn39, btn40;

    Button currentBtn;
    int numberRows;
    int numberColumn;


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

        this.tableLayout = createTable(15,4);


        setContentView(tableLayout);

//        btn2 = findViewById(R.id.button2);
//        btn2.setOnClickListener(this);
//
//
//        btn3 = findViewById(R.id.button3);
//        btn3.setOnClickListener(this);
//
//        btn4 = findViewById(R.id.button4);
//        btn4.setOnClickListener(this);
//
//        btn6 = findViewById(R.id.button6);
//        btn6.setOnClickListener(this);
//
//        btn7 = findViewById(R.id.button7);
//        btn7.setOnClickListener(this);
//
//        btn8 = findViewById(R.id.button8);
//        btn8.setOnClickListener(this);
//
//        btn10 = findViewById(R.id.button10);
//        btn10.setOnClickListener(this);
//
//        btn11 = findViewById(R.id.button11);
//        btn11.setOnClickListener(this);
//
//        btn12 = findViewById(R.id.button12);
//        btn12.setOnClickListener(this);
//
//        btn14 = findViewById(R.id.button14);
//        btn14.setOnClickListener(this);
//
//        btn15 = findViewById(R.id.button15);
//        btn15.setOnClickListener(this);
//
//        btn16 = findViewById(R.id.button16);
//        btn16.setOnClickListener(this);
//
//        btn18 = findViewById(R.id.button18);
//        btn18.setOnClickListener(this);
//
//        btn19 = findViewById(R.id.button19);
//        btn19.setOnClickListener(this);
//
//        btn20 = findViewById(R.id.button20);
//        btn20.setOnClickListener(this);
//
//        btn22 = findViewById(R.id.button22);
//        btn22.setOnClickListener(this);
//
//        btn23 = findViewById(R.id.button23);
//        btn23.setOnClickListener(this);
//
//        btn24 = findViewById(R.id.button24);
//        btn24.setOnClickListener(this);
//
//        btn26 = findViewById(R.id.button26);
//        btn26.setOnClickListener(this);
//
//        btn27 = findViewById(R.id.button27);
//        btn27.setOnClickListener(this);
//
//        btn28 = findViewById(R.id.button28);
//        btn28.setOnClickListener(this);
//
//        btn30 = findViewById(R.id.button30);
//        btn30.setOnClickListener(this);
//
//        btn31 = findViewById(R.id.button31);
//        btn31.setOnClickListener(this);
//
//        btn32 = findViewById(R.id.button32);
//        btn32.setOnClickListener(this);
//
//        btn34 = findViewById(R.id.button34);
//        btn34.setOnClickListener(this);
//
//        btn35 = findViewById(R.id.button35);
//        btn35.setOnClickListener(this);
//
//        btn36 = findViewById(R.id.button36);
//        btn36.setOnClickListener(this);
//
//        btn38 = findViewById(R.id.button38);
//        btn38.setOnClickListener(this);
//
//        btn39 = findViewById(R.id.button39);
//        btn39.setOnClickListener(this);
//
//        btn40 = findViewById(R.id.button40);
//        btn40.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button2:
//                currentBtn = btn2;
//                getResultPlayerName();
//                break;
//            case R.id.button3:
//                currentBtn = btn3;
//                getResultPlayerName();
//                break;
//            case R.id.button4:
//                currentBtn = btn4;
//                getResultPlayerName();
//                break;
//            case R.id.button6:
//                currentBtn = btn6;
//                getResultHolePoints();
//                break;
//            case R.id.button7:
//                currentBtn = btn7;
//                getResultHolePoints();
//                break;
//            case R.id.button8:
//                currentBtn = btn8;
//                getResultHolePoints();
//                break;
//            case R.id.button10:
//                currentBtn = btn10;
//                getResultHolePoints();
//                break;
//            case R.id.button11:
//                currentBtn = btn11;
//                getResultHolePoints();
//                break;
//            case R.id.button12:
//                currentBtn = btn12;
//                getResultHolePoints();
//                break;
//            case R.id.button14:
//                currentBtn = btn14;
//                getResultHolePoints();
//                break;
//            case R.id.button15:
//                currentBtn = btn15;
//                getResultHolePoints();
//                break;
//            case R.id.button16:
//                currentBtn = btn16;
//                getResultHolePoints();
//                break;
//            case R.id.button18:
//                currentBtn = btn18;
//                getResultHolePoints();
//                break;
//            case R.id.button19:
//                currentBtn = btn19;
//                getResultHolePoints();
//                break;
//            case R.id.button20:
//                currentBtn = btn20;
//                getResultHolePoints();
//                break;
//            case R.id.button22:
//                currentBtn = btn22;
//                getResultHolePoints();
//                break;
//            case R.id.button23:
//                currentBtn = btn23;
//                getResultHolePoints();
//                break;
//            case R.id.button24:
//                currentBtn = btn24;
//                getResultHolePoints();
//                break;
//            case R.id.button26:
//                currentBtn = btn26;
//                getResultHolePoints();
//                break;
//            case R.id.button27:
//                currentBtn = btn27;
//                getResultHolePoints();
//                break;
//            case R.id.button28:
//                currentBtn = btn28;
//                getResultHolePoints();
//                break;
//            case R.id.button30:
//                currentBtn = btn30;
//                getResultHolePoints();
//                break;
//            case R.id.button31:
//                currentBtn = btn31;
//                getResultHolePoints();
//                break;
//            case R.id.button32:
//                currentBtn = btn32;
//                getResultHolePoints();
//                break;
//            case R.id.button34:
//                currentBtn = btn34;
//                getResultHolePoints();
//                break;
//            case R.id.button35:
//                currentBtn = btn35;
//                getResultHolePoints();
//                break;
//            case R.id.button36:
//                currentBtn = btn36;
//                getResultHolePoints();
//                break;
//            case R.id.button38:
//                currentBtn = btn38;
//                getResultHolePoints();
//                break;
//            case R.id.button39:
//                currentBtn = btn39;
//                getResultHolePoints();
//                break;
//            case R.id.button40:
//                currentBtn = btn40;
//                getResultHolePoints();
//                break;
//
//
//
//            default:
//                break;
//        }
    }

    private void getResultPlayerName(){
        Intent intent = new Intent(this, ChangePlayerName.class);
        startForPlayerName.launch(intent);
    }

    private void getResultHolePoints(){
        Intent intent = new Intent (this, ChosePoints.class);
        startForPoints.launch(intent);
    }

    private void sumPoints(int player){

    }

    private TableLayout createTable(int holeNo, int playerNo){
        TableLayout mainTable = new TableLayout(this);
        mainTable.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, 1.0f));



        TableRow header = new TableRow(this);

        Button btn0 = new Button(this);
        btn0.setBackgroundResource(R.drawable.green2button);
        btn0.setText("Hole");
        btn0.setTextColor(Color.WHITE);
        header.addView(btn0);

        for(int i = 0; i < playerNo; i++){
            Button btn = new Button(this);
            btn.setBackgroundResource(R.drawable.green2button);
            btn.setText("Spieler " + (i + 1));
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