package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class cami extends AppCompatActivity {
TextView yaztext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cami);
        this.setTitle("Kasımbey Camisi");
        yaztext4 = (TextView) findViewById(R.id.yaztext4);
        yaztext4.setText("Kasımbey Camisi\n" +
                "İlçemiz uzun yıllar Arap hakimiyetinde kalmıştır.\n" +
                "Abasiler zamanında bu ilçeye Kasım bey adında biri\n" +
                "bırakılır. Kasımbey buraya kendi adına bir cami ve\n" +
                "köprü yaptırır. Cami yaklaşık 1000 yıldır. Varlığını\n" +
                "sürdürmektedir.");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}