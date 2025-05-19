package com.sw.agricultureaiassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText etuname,etpass,etmob,etemail;
    Button btnRegister;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etuname=findViewById(R.id.et_uname);
        etpass=findViewById(R.id.et_pass);
        etmob=findViewById(R.id.et_mail);
        etemail=findViewById(R.id.et_mob);
        btnRegister = findViewById(R.id.btnregister);

        db = new DatabaseHelper(this);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etuname.getText().toString();
                String password = etpass.getText().toString();
                String email = etemail.getText().toString();
                String mobile = etmob.getText().toString();

                if (username.isEmpty() || password.isEmpty() || email.isEmpty() || mobile.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    boolean isInserted = db.insertData(username, password, email, mobile);
                    System.out.println("status"+isInserted);
                    if (isInserted) {
                        Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();

                        Intent in=new Intent(getApplicationContext(),Login.class);
                        startActivity(in);
                    } else {
                        Toast.makeText(getApplicationContext(), "Registration Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}