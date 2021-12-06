package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class Signup extends AppCompatActivity {
    Button button,btn2,btn3;
    CheckBox checkBox,chk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        chk1=(CheckBox) findViewById(R.id.chk1);
        btn3=(Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                links();
            }
        });
        btn2=(Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
                if(chk1.isChecked()){

                    Toast.makeText(Signup.this,"Thanks for Accepting All Conditions", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Signup.this,"Please Agree to all Terms and Conditions",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void register(){
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
    public void links(){
        Intent i=new Intent(this,Links.class);
        startActivity(i);
    }
}