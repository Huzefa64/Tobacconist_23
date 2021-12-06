package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    Button button,lgt,todoB;
    ImageView imageview,image_view1,image_view20,image_view21,image_view22,image_view23,image_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();
        image_view1=(ImageView)findViewById(R.id.image_view1);
        image_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pojo();
            }
        });
        image_view20=(ImageView)findViewById(R.id.image_view20);
        image_view20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adi();
            }
        });
        image_view21=(ImageView)findViewById(R.id.image_view21);
        image_view21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ali();
            }
        });
        image_view22=(ImageView)findViewById(R.id.image_view22);
        image_view22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huz();
            }
        });
        image_view23=(ImageView)findViewById(R.id.image_view23);
        image_view23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ul();
            }
        });
        image_view=(ImageView)findViewById(R.id.image_view);
        image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qz();
            }
        });
        todoB=(Button) findViewById(R.id.todoB);
        todoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jojo();
            }
        });
        lgt=(Button) findViewById(R.id.lgt);
        lgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oppo();
            }
        });
    }

    public void oppo(){
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
    public void jojo(){
        Intent i=new Intent(this,Edit_Profile.class);
        startActivity(i);
    }
    public void pojo(){
        Intent i=new Intent(this,Near_By.class);
        startActivity(i);
    }
    public void adi(){
        Intent i=new Intent(this,Delivery.class);
        startActivity(i);
    }
    public void ali(){
        Intent i=new Intent(this,Aboutus.class);
        startActivity(i);
    }
    public void huz(){
        Intent i=new Intent(this,Contactus.class);
        startActivity(i);
    }
    public void ul(){
        Intent i=new Intent(this,Help.class);
        startActivity(i);
    }
    public void qz(){
        Intent i=new Intent(this,Setting.class);
        startActivity(i);
    }

}