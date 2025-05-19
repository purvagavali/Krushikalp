package com.sw.agricultureaiassistant;

import static com.google.api.AnnotationsProto.http;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Market_Display extends AppCompatActivity {
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_display);

        web=findViewById(R.id.webv);
        web.loadUrl("http://192.168.1.16/KrishiBharti/allproducts.php?uid="+UserLogin.lid);
        System.out.println("http://192.168.1.16/KrishiBharti/allproducts.php?uid="+UserLogin.lid);


        // onPageFinished and override Url loading.
        web.setWebViewClient(new WebViewClient());
    }
}