package com.example.kaustubhpatkar.expensecalculator;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.database.sqlite.*;
import android.graphics.Color;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public final static String userid="com.example.kaustubhpatkar.MESSAGE";
    public final static String passwordlen="com.example.kaustubhpatkar.MESSAGE";
    public static int Food=0;
    public static int Transport=0;
    public static int Education=0;
    public static int Others=0;
    Button b1;
    TextView username,password,t1,t2,textmain,textuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        textmain=(TextView)findViewById(R.id.textView);
        t1=(TextView)findViewById(R.id.textView2);
        t2=(TextView)findViewById(R.id.textView3);
      //  textuser=(TextView)findViewById(R.id.textView4);
        //textmain.setTextColor(Color.parseColor("#F8F8FF"));
       // t1.setTextColor(Color.parseColor("#FFFFFF"));
       // t2.setTextColor(Color.parseColor("#FFFFFF"));
        //textuser.setTextColor(Color.parseColor("#FFFFFF"));





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this,UserView.class);

                username=(TextView) findViewById(R.id.username);
                password=(TextView) findViewById(R.id.password);

                final String user=username.getText().toString();
                final String pass=password.getText().toString();


                intent.putExtra(userid,user);
                intent.putExtra(passwordlen,pass);
                startActivity(intent);
            }
        });

    }

}

