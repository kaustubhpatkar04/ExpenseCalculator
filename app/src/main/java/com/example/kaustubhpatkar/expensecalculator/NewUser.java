package com.example.kaustubhpatkar.expensecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

/**
 * Created by kaustubhpatkar on 11/9/17.
 */

public class NewUser extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        TextView t1,t2,t3,t4;
        super.onCreate(savedInstanceState);
        t1=(TextView)findViewById(R.id.editText4);
        t2=(TextView)findViewById(R.id.editText5);
        t3=(TextView)findViewById(R.id.editText6);
        t4=(TextView)findViewById(R.id.editText7);

    }
    public void onClick_User(View view)
    {
           Intent intent = new Intent(this,MainActivity.class);
           startActivity(intent);
    }
}
