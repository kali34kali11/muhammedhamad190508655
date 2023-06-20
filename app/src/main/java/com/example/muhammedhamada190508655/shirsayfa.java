package com.example.muhammedhamada190508655;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class shirsayfa extends AppCompatActivity {
    TextView yaztext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirsayfa);
        this.setTitle("yayladagi sehir");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        yaztext = (TextView) findViewById(R.id.yaztext);
        yaztext.setText("İslam bölgeye Abbasiler tarafından getirilmiştir, Selçuklu Hanedanı ile devam etmiştir. İlçe merkezinin 9. ve 10. yüzyılda kurulduğu sanılmaktadır. Avar Türkleri’nden Savcılar Boyunun başı Kasım Bey bu toprakları Bizans’tan alıp bir cami, bir köprü ve bir okul yaptırmıştır. Kasım Bey Cami ve Kasımbey Köprüsü bugüne kadar ulaşmıştır. Osmanlı İmparatorluğu döneminde ilçeye Ordu-Muradiye isimleri verilmiştir. Yavuz Sultan Selim döneminde bu bölgeye Türkleri yerleştirmiştir. Yavuz Sultan Selim Mısır Seferi dönüşünde burada ordusu ile birlikte konakladığı için buraya “ordu” denilmiştir. 1918’de İngilizler, daha sonra Fransızlar tarafından işgal edilen Hatay, 1938’de Bağımsız Hatay Cumhuriyeti’ne katıldı. 1940'ta adı “Ordu” ile karıştığı için “Yayladağı” olarak adı değiştirildi. Bu adı “Yayladağı” isimli dağından almıştır. Hatay’ın kurtuluş günü olan 23 Temmuz Yayladağı’da kurtuluş günü olarak kutlar");

    }
}