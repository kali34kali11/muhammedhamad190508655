package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ispann extends AppCompatActivity {
     TextView yaztext7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispann);
        yaztext7 = (TextView) findViewById(R.id.yaztext7);
        this.setTitle("Ispanaklı Borani Tarifi (Videolu)");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        yaztext7.setText("Ispanaklı Borani Tarifi İçin Malzemeler\n" +
                "5 yemek kaşığı sıvı yağ\n" +
                "1 adet soğan\n" +
                "1 kg ıspanak\n" +
                "Tuz\n" +
                "Sosu İçin\n" +
                "1 su bardağı süzme yoğurt\n" +
                "Yarım su bardağı yoğurt\n" +
                "2 diş sarımsak\n" +
                "Tuz\n" +
                "Üzeri İçin\n" +
                "Tereyağı\n" +
                "Toz biber");

    }
}