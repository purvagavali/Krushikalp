package com.sw.agricultureaiassistant;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class FarmerOrder extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_farmer_order);
String fid=DatabaseHelper.fid;
        web=findViewById(R.id.webv);
        web.loadUrl("http://192.168.1.16/KrishiBharti/farmOrder.php?fid="+fid);
        System.out.println("http://192.168.1.16/KrishiBharti/farmOrder.php");

        web.setWebViewClient(new WebViewClient());


    }
}