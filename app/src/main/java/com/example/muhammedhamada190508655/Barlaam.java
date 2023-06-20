package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Barlaam extends AppCompatActivity {
 TextView yaztext3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barlaam);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        yaztext3 = (TextView) findViewById(R.id.yaztext3);
        this.setTitle("Barlaam Manastır");
        yaztext3.setText(
                "Barlaam Manastır\n" +
                "Türkiye'nin Hatay ilinin Yayladağı ilçesinde harap hâlde\n" +
                "bir Gürcü manastırdır. Manastıra ulaşımın tek yolu\n" +
                "Yeditepe beldesinden yaya olarak 2.5 saat boyunca\n" +
                "dağa tırmanmaktır. Manastır, Türkiye-Suriye sınırına\n" +
                "yakın bir konumdadır.\n" +
                "MÖ 3. yüzyılda, Selevkos İmparatorluğu döneminde\n" +
                "manastırın yerinde Dorik bir tapınak vardı.");
    }
}