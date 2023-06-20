package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class kunfe extends AppCompatActivity {
  TextView yaztext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("hatay künefe");
        setContentView(R.layout.activity_kunfe);
        yaztext2 = (TextView) findViewById(R.id.yaztext2);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        yaztext2.setText("hatay künefe\n" +
                "200 gram tel kadayıf\n" +
                "2 çorba kaşığı tereyağı\n" +
                "150 gram kadar künefelik dil peyniri (kaşar peyniri\n" +
                "kullanmayınız)\n" +
                "Şerbeti Hazırlanırken;\n" +
                "2 çay bardağı toz şeker\n" +
                "1,5 çay bardağı sus\n" +
                "Birkaç damla limon\n" +
                "Üzerine bol bol Antep fıstığı");

    }
}