package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Verification_Code extends AppCompatActivity {
    Button button,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);
        getSupportActionBar().hide();
        btn7=(Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                back();
                Toast.makeText(Verification_Code.this,"Password Changed",Toast.LENGTH_SHORT).show();
            }

        });
    }


    public void back(){
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
}