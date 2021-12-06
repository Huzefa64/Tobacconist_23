package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Delivery extends AppCompatActivity {
    Button button,btn56;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        getSupportActionBar().hide();
        btn56=(Button) findViewById(R.id.btn56);
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payment();
            }
        });

    }

    public void payment(){
        Intent i=new Intent(this,Payment_Method.class);
        startActivity(i);
    }
}