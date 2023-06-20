package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

ListView buttonListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       this.setTitle("yayladagi");
        buttonListView = findViewById(R.id.itmlest);


        final List<String> buttonLabels = Arrays.asList("hatay yayladagi sehir", "yayladagı Tarihi Yerler", " yayladagi Yöresel Yemekler","yayladagi Yörsel Tatlı");

        ButtonListAdapter adapter = new ButtonListAdapter(this, buttonLabels, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                String label = buttonLabels.get(position);

                Toast.makeText(MainActivity.this, "Clicked " + label, Toast.LENGTH_SHORT).show();

                // Perform different tasks based on the clicked button
                switch (position) {
                    case 0:
                         Intent shir = new Intent(MainActivity.this,shirsayfa.class);
                         startActivity(shir);
                        break;
                    case 1:
                        Intent tarih = new Intent(MainActivity.this,Tarihi.class);
                        startActivity(tarih);                        break;
                    case 2:
                        Intent yemek = new Intent(MainActivity.this,yemek.class);
                        startActivity(yemek);                        break;
                    case 3:
                        Intent tatli = new Intent(MainActivity.this,tatli2.class);
                        startActivity(tatli);
                        break;
                }
            }
        });

        buttonListView.setAdapter(adapter);
    }

    private class ButtonListAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final List<String> buttonLabels;
        private final View.OnClickListener buttonClickListener;

        public ButtonListAdapter(Context context, List<String> buttonLabels, View.OnClickListener buttonClickListener) {
            super(context, -1, buttonLabels);
            this.context = context;
            this.buttonLabels = buttonLabels;
            this.buttonClickListener = buttonClickListener;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Button button;

            if (convertView == null) {
                button = new Button(context);
                button.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
            } else {
                button = (Button) convertView;
            }

            String label = getItem(position);
            button.setText(label);
            button.setTag(position);

            button.setOnClickListener(buttonClickListener);

            return button;
        }


    }

}