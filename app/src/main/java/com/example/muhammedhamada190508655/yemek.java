package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class yemek extends AppCompatActivity {
   TextView sisp,ispan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);
        sisp = (TextView) findViewById(R.id.sisp);
        ispan = (TextView) findViewById(R.id.ispan);
        this.setTitle("hatay yayladağı yemek");
        sisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(yemek.this, sispr.class);
                startActivity(si);
            }
        });
        ispan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is = new Intent(yemek.this, ispann.class);
                startActivity(is);
            }
        });
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }
}