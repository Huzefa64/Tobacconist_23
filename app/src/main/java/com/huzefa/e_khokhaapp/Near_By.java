package com.huzefa.e_khokhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Near_By extends AppCompatActivity {
    ListView l;
    String tutorials[]
            = { "CHAI DHAMAL, RAIWIND ROAD", "BAHRIA TOWN, SAFARI BLOCK",
            "PAK TEA HOUSE, MALL ROAD", "LAKE VIEW",
            "LAKE CITY", "SUKHCHAIN, MM ALAM ROAD",
            "BURNING GIRAFFE, DHA ", "HAVELI, FOOD STREET",
            "GLORIA JEANS, JOHAR TOWN" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_by);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                tutorials);
        l.setAdapter(arr);



    }
}