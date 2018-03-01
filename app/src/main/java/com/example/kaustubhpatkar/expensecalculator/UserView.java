package com.example.kaustubhpatkar.expensecalculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.util.Log;

/**
 * Created by kaustubhpatkar on 11/10/17.
 */



public class UserView extends Activity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        TextView t_education,t_travel,t_food,t_others;

     t_education = (TextView) findViewById(R.id.textView13);
       /* t_travel=(TextView)findViewById(R.id.textView14);
        t_food=(TextView)findViewById(R.id.textView15);
        t_others=(TextView)findViewById(R.id.textView16);*/

        // String temp = String.valueOf(MainActivity.Education);
       // t_education.setText("Hello");


       /* t_travel.setText(""+MainActivity.Transport);
        t_food.setText(""+MainActivity.Food);
        t_others.setText(""+MainActivity.Others);*/



        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.userid);
        String password = intent.getStringExtra(MainActivity.passwordlen);
    setContentView(R.layout.userview);

    }
    public void onClick_AddExpense(View view)
    {
        Intent intent= new Intent(this,ExpenseCalculator.class);
        startActivity(intent);

    }
    public void onClick_Expenses(View view)
    {
        TextView t_education,t_travel,t_food,t_others;
        t_education = (TextView) findViewById(R.id.textView13);
        t_education.setText(String.valueOf(MainActivity.Education));
        t_travel = (TextView) findViewById(R.id.textView14);
        t_travel.setText(String.valueOf(MainActivity.Transport));
        t_food=(TextView)findViewById(R.id.textView15);
        t_food.setText(String.valueOf(MainActivity.Food));
        t_others=(TextView)findViewById(R.id.textView16);
        t_others.setText(String.valueOf(MainActivity.Others));

    }
}