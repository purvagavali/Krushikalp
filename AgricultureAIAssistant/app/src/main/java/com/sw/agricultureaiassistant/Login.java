package com.sw.agricultureaiassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnrg,btnlog;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText etuname=findViewById(R.id.et_uname_log);
        EditText  etpass=findViewById(R.id.et_pass_log);
        btnrg=findViewById(R.id.btn_reg);
        btnlog=findViewById(R.id.btn_login);
        db = new DatabaseHelper(this);
        btnrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),Register.class);
                startActivity(in);

            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etuname.getText().toString();
                String password = etpass.getText().toString();
//              if (username.isEmpty() || password.isEmpty()){

                boolean isValid = db.checkUser(username, password);

                if (isValid) {
                    Intent in = new Intent(getApplicationContext(), Dashboard.class);
                    startActivity(in);
                } else {
                    Toast.makeText(Login.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }

//              }else{
//
//                  Toast.makeText(getApplicationContext(),"Wrong Details",Toast.LENGTH_LONG).show();
//              }
            }
        });

    }
}