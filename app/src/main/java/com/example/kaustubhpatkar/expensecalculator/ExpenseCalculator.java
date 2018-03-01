package com.example.kaustubhpatkar.expensecalculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.graphics.Color;
import android.database.sqlite.*;
import java.util.ArrayList;
import java.util.*;
/**
 * Created by kaustubhpatkar on 11/8/17.
 */

public class ExpenseCalculator extends Activity {

    Button button_travel, button_grocery, button_others, button_transport;
    TextView text1,text2;
    public final static String cat="com.example.kaustubhpatkar.MESSAGE";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expensecalculator);

        button_travel = (Button) findViewById(R.id.button2);
        button_grocery = (Button) findViewById(R.id.button3);
        button_transport = (Button) findViewById(R.id.button4);
        button_others = (Button) findViewById(R.id.button5);
        text1=(TextView)findViewById(R.id.textView5);
        Intent intent = getIntent();
         text1.setTextColor(Color.parseColor("#ff0000"));
        text2=(TextView)findViewById(R.id.textView7);



        String username = intent.getStringExtra(MainActivity.userid);
        String password = intent.getStringExtra(MainActivity.passwordlen);

    }
            public void onClick_Education(View view) {

               String category="Education";
                Intent intent = new Intent(ExpenseCalculator.this,AddExpense.class);
                intent.putExtra(cat,category);
                startActivity(intent);
            }

            public void onClick_Food(View view)
            {
                String category1="Food";
                Intent intent = new Intent(ExpenseCalculator.this,AddExpense.class);
                intent.putExtra(cat,category1);
                startActivity(intent);

            }
            public void onClick_Transport(View view)
           {
             String category2="Transport";
             Intent intent = new Intent(ExpenseCalculator.this,AddExpense.class);
               intent.putExtra(cat,category2);
               startActivity(intent);

           }
            public void onClick_Others(View view)
            {
                String category3="Others";
                Intent intent = new Intent(ExpenseCalculator.this,AddExpense.class);
                intent.putExtra(cat,category3);
                startActivity(intent);

            }
}


