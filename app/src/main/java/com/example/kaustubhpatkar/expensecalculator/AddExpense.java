package com.example.kaustubhpatkar.expensecalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
/**
 * Created by kaustubhpatkar on 11/8/17.
 */



public class AddExpense extends Activity {
    public final static String categoryexpense="com.example.kaustubhpatkar.MESSAGE";
    TextView t1,t_cost;
    String category;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addexpense);
        t1=(TextView)findViewById(R.id.editText2);
        Intent intent1 = getIntent();
        category=intent1.getStringExtra(ExpenseCalculator.cat);
        t1.setText(category);

    }
    public void onClick_Plus(View view)
    {
        Intent intent= new Intent(AddExpense.this,ExpenseCalculator.class);

        t1=(TextView)findViewById(R.id.editText2);
        t_cost=(TextView)findViewById(R.id.editText);
        t1.setText(String.valueOf(t_cost.getText()));
        int cost=Integer.parseInt(String.valueOf(t_cost.getText()));


        if(category.equals("Transport"))
        {
            MainActivity.Transport=MainActivity.Transport+cost;
        }
        if(category.equals("Food"))
        {
            MainActivity.Food=MainActivity.Food+cost;
        }
        if(category.equals("Education"))
        {
            MainActivity.Food=MainActivity.Education+cost;
        }
        if(category.equals("Others"))
        {
            MainActivity.Food=MainActivity.Others+cost;
        }

        startActivity(intent);

    }
    public void onClick_Finish(View view)
    {
        Intent intent= new Intent(AddExpense.this,ExpenseCalculator.class);

        t1=(TextView)findViewById(R.id.editText2);
        t_cost=(TextView)findViewById(R.id.editText);

        int cost=Integer.parseInt(String.valueOf(t_cost.getText()));


        if(category.equals("Transport"))
        {
            MainActivity.Transport=MainActivity.Transport+cost;
        }
        if(category.equals("Food"))
        {
            MainActivity.Food=MainActivity.Food+cost;
        }
        if(category.equals("Education"))
        {
            MainActivity.Food=MainActivity.Education+cost;
        }
        if(category.equals("Others"))
        {
            MainActivity.Food=MainActivity.Others+cost;
        }


        Intent intent1= new Intent(AddExpense.this,UserView.class);
        startActivity(intent1);
    }
}
