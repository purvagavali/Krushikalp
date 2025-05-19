package com.sw.agricultureaiassistant;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class UserReg extends AppCompatActivity {

    EditText edit1,edit2,edit3,edit4;
    Button btnlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_reg);

        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        edit3=findViewById(R.id.edit3);
        edit4=findViewById(R.id.edit4);
        btnlog=findViewById(R.id.btnlog);

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(), UserLogin.class);
                startActivity(in);
               String userName =edit1.getText().toString();
               String userPassword = edit2.getText().toString();
               String userMobile= edit3.getText().toString();
               String userAddress =edit4.getText().toString();
               userData(userName,userPassword,userMobile,userAddress);
            }
        });


    }
    private void userData(String name,String pass ,String mob,String addr) {
        new Thread(() -> {
            try {


                String boundary = "*";
                URL url = new URL("http://192.168.1.16/KrishiBharti/userdata.php");
                System.out.println("http://192.168.1.16/KrishiBharti/userdata.php");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Connection", "Keep-Alive");
                connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
                DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"uname\"\r\n\r\n" + name + "\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"upass\"\r\n\r\n" + pass + "\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"umobile\"\r\n\r\n" + mob +"\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"uadd\"\r\n\r\n" + addr + "\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");


//                  FileInputStream fileInputStream = new FileInputStream(imageFile);
//                    int bytesAvailable = fileInputStream.available();
//                    byte[] buffer = new byte[bytesAvailable];
//                    fileInputStream.read(buffer);
//                    outputStream.write(buffer);
//                    System.out.println(outputStream);
//                    outputStream.writeBytes("\r\n--" + boundary + "--\r\n");
//                    fileInputStream.close();
//                    outputStream.flush();
//                    outputStream.close();

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    Log.d("Saved", "DataSaved successful"+responseCode);
                    Intent in=new Intent(getApplicationContext(), UserLogin.class);
                    startActivity(in);
                } else {
                    Log.d("Saved", "Failed: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        Toast.makeText(this," Data Saved",Toast.LENGTH_SHORT).show();


    }
}