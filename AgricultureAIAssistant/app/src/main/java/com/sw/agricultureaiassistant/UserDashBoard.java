package com.sw.agricultureaiassistant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserDashBoard extends AppCompatActivity {

   TextView tmarket,torder;
   ImageView mark,ord,log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_dash_board);

        tmarket=findViewById(R.id.tmarket);
        torder=findViewById(R.id.torder);
        mark=findViewById(R.id.mark);
        ord=findViewById(R.id.ord);
       log=findViewById(R.id.logout_button);

        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), Market_Display.class);
                startActivity(in);
            }
        });


        ord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), ViewProduct.class);
                startActivity(in);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainDashboard.class);
                startActivity(in);
            }
        });


    }
}