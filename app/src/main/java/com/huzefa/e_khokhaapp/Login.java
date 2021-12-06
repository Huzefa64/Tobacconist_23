package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button button,btn,btn1;
    TextView textview,tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        tv1=(TextView)findViewById(R.id.tv1);
        btn=(Button)findViewById(R.id.btn);
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin();
            }
        });

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               signup();
           }



       });

       tv1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               forgot();
           }
       });




    }
    public void signup()
    {
        Intent i=new Intent(this,Signup.class);
        startActivity(i);
    }
    public void signin()
    {
        Intent i=new Intent(this,Dashboard.class);
        startActivity(i);
    }
    public void forgot()
    {
        Intent i=new Intent(this,Forgot_Password.class);
        startActivity(i);
    }
}