package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Forgot_Password extends AppCompatActivity {
    Button button,btnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().hide();
        btnv=(Button)findViewById(R.id.btnv);
        btnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifi();
            }

        });
    }

    public void verifi(){
        Intent i=new Intent(this,Verification_Code.class);
        startActivity(i);
    }

}