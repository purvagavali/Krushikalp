package com.sw.agricultureaiassistant;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Payment extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_payment);

      webView=findViewById(R.id.web1);
        webView.loadUrl("http://192.168.1.16/KrishiBharti/payment.php?uid="+UserLogin.lid);
        System.out.println("http://192.168.1.16/KrishiBharti/payment.php?uid="+UserLogin.lid);
        webView.setWebViewClient(new WebViewClient());

    }
}