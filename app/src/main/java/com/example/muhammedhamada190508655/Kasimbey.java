package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Kasimbey extends AppCompatActivity {
   TextView yaztext5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasimbey);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Kasımbey Köprüsü");
        yaztext5 = (TextView) findViewById(R.id.yaztext5);
        yaztext5.setText("Kasımbey Köprüsü\n" +
                "İlçemiz uzun yıllar Arap hakimiyetinde kalmıştır.\n" +
                "Abasiler zamanında bu ilçeye Kasım bey adında biri\n" +
                "bırakılır. Kasımbey buraya kendi adına bir cami ve\n" +
                "köprü yaptırır");

    }
}