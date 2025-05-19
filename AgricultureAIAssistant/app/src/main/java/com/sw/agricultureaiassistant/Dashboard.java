package com.sw.agricultureaiassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {
ImageView imgmarket,imgfert,imgcrop,imgweather,logout,fandq;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        imgmarket=findViewById(R.id.imgmarket);
        imgfert=findViewById(R.id.imgfertilizer);
        imgcrop=findViewById(R.id.imgcrop);
        imgweather=findViewById(R.id.imgweather);
        btn=findViewById(R.id.order);
        logout=findViewById(R.id.log_btn);
        fandq=findViewById(R.id.f_and_q);

        imgmarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),Market.class);
                startActivity(in);
            }
        });
        imgweather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WeatherPrediction.class);
                startActivity(in);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), FarmerOrder.class);
                startActivity(in);
            }
        });

        imgfert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), FertilizerDect.class);
                startActivity(in);
            }
        });

        imgcrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), CropDetection.class);
                startActivity(in);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainDashboard.class);
                startActivity(in);
            }
        });

        fandq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Question.class);
                startActivity(in);
            }
        });



    }
}