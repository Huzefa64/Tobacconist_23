package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;import android.annotation.SuppressLint;

public class Contactus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("Feel free to contact US.")
                .addItem(new Element().setTitle("0311-4194558"))
                .addEmail("huzefa4194@gmail.com ")
                .addWebsite("www.e-khokha.com")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d HA", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Contactus.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}