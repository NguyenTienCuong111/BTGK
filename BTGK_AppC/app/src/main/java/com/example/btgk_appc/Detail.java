package com.example.btgk_appc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    TextView txtDetail, txtMota;
    ImageView imgHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtDetail = (TextView) findViewById(R.id.textViewDetail);
        txtMota = (TextView) findViewById(R.id.textViewMota) ;
        imgHinh =(ImageView) findViewById(R.id.imageviewHinh);

        Intent intent = getIntent();
        String noiDung = intent.getStringExtra("tencauthu");
        txtDetail.setText(noiDung);

        String Mota = intent.getStringExtra("mota");
        txtMota.setText(Mota);

        int Hinh = intent.getIntExtra("hinh",1);
        imgHinh.setImageResource(Hinh);

    }
}