package com.sw.agricultureaiassistant;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Question extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_question);


        web=findViewById(R.id.web2);
        web.loadUrl("http://192.168.1.16/KrishiBharti/andq.php?uid=");
        System.out.println("http://192.168.1.16/KrishiBharti/andq.php?uid=");

        web.setWebViewClient(new WebViewClient());

    }
}