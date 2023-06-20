package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sispr extends AppCompatActivity {
    TextView yaztext6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sispr);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("Şişperek Hatay ‘ın YöreselYemeği");
        yaztext6 = (TextView) findViewById(R.id.yaztext6);
        yaztext6.setText("2 su bardağı mantı\n" +
                "1 çay bardağı pirinç\n" +
                "Yarım kilo yoğurt\n" +
                "1 litre su\n" +
                "Sosu için :\n" +
                "3 çorba kaşığı zeytinyağı\n" +
                "Nane\n" +
                "Pulbiber\n" +
                "Tuz");
    }
}