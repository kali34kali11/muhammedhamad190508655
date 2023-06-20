package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tarihi extends AppCompatActivity {
    TextView Barlaam,cami,Kasimbey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi);
        Barlaam = (TextView) findViewById(R.id.Barlaam);
        cami = (TextView) findViewById(R.id.cami);
        Kasimbey = (TextView) findViewById(R.id.Kasimbey);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        this.setTitle("yayladağı bulunan tarihi yerler");
        Barlaam.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent bar = new Intent(Tarihi.this,Barlaam.class);
               startActivity(bar);
           }
       });
     cami.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent cami = new Intent(Tarihi.this,cami.class);
             startActivity(cami);
         }
     });
     Kasimbey.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent kasimby = new Intent(Tarihi.this,Kasimbey.class);
             startActivity(kasimby);
         }
     });
    }
}