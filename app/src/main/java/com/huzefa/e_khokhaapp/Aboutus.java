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


public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("E-KHOKHA provides you the best cigarettes in the town if you are above 18.")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("THANK YOU FOR SMOKING WITH US!")
                .addEmail("huzefa4194@gmail.com ")
                .addWebsite("www.e-khokha.com")
                .addYoutube("https://www.youtube.com/watch?v=nQFOEXaqIiA")
                .addPlayStore("com.huzefa.e_khokhaapp")
                .addInstagram("E-khokha")
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
                Toast.makeText(Aboutus.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}