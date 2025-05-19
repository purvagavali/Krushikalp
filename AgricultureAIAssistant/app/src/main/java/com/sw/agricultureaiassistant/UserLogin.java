//package com.sw.agricultureaiassistant;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//import java.io.DataOutputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class UserLogin extends AppCompatActivity {
//TextView  text1,text2;
//ImageView uimg;
//EditText edit1,edit2;
//Button btnlog;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_user_login);
//
//        text1=findViewById(R.id.text1);
//text2=findViewById(R.id.text2);
//edit1=findViewById(R.id.edit1);
//edit2=findViewById(R.id.edit2);
//btnlog=findViewById(R.id.btnlog);
//
//text2.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        Intent in= new Intent(getApplicationContext(),UserReg.class);
//        startActivity(in);
//    }
//});
//
//btnlog.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//
//        String username = edit1.getText().toString();
//        String password = edit2.getText().toString();
//
//        // Validation to check if both username and password are entered
//        if (username.isEmpty() || password.isEmpty()) {
//            Toast.makeText(UserLogin.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
//        } else {
//            userLog(username, password);
//            Intent in = new Intent(getApplicationContext(), UserDashBoard.class);
//            startActivity(in);
//        }
////        userLog(username,password);
////        Intent in = new Intent(getApplicationContext(),UserDashBoard.class);
////        startActivity(in);
//    }
//});
//
//
//
//    }
//    private void userLog(String name,String pass) {
//        new Thread(() -> {
//            try {
//                String boundary = "*";
//                URL url = new URL("http://192.168.1.14/KrishiBharti/userLog.php");
//                System.out.println("http://192.168.1.14/KrishiBharti/userLog.php");
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setDoInput(true);
//                connection.setDoOutput(true);
//                connection.setRequestMethod("POST");
//                connection.setRequestProperty("Connection", "Keep-Alive");
//                connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
//                DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
//                outputStream.writeBytes("--" + boundary + "\r\n");
//                outputStream.writeBytes("Content-Disposition: form-data; name=\"uname\"\r\n\r\n" + name + "\r\n");
//                outputStream.writeBytes("--" + boundary + "\r\n");
//                outputStream.writeBytes("Content-Disposition: form-data; name=\"upass\"\r\n\r\n" + pass + "\r\n");
//                outputStream.writeBytes("--" + boundary + "\r\n");
////                outputStream.writeBytes("Content-Disposition: form-data; name=\"umobile\"\r\n\r\n" + mob +"\r\n");
////                outputStream.writeBytes("--" + boundary + "\r\n");
////                outputStream.writeBytes("Content-Disposition: form-data; name=\"uadd\"\r\n\r\n" + addr + "\r\n");
////                outputStream.writeBytes("--" + boundary + "\r\n");
//
//
//                int responseCode = connection.getResponseCode();
//                if (responseCode == HttpURLConnection.HTTP_OK) {
//                    Log.d("Saved", "DataSaved successful"+responseCode);
//
////                    Toast.makeText(this,"Product Uploaded Successfully",Toast.LENGTH_SHORT).show();
//                    Intent in=new Intent(getApplicationContext(), UserDashBoard.class);
//                    startActivity(in);
//                } else {
//                    Log.d("Saved", "Failed: " + responseCode);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }).start();
//        Toast.makeText(this,"Successfully Login",Toast.LENGTH_SHORT).show();
//
//    }
//}




package com.sw.agricultureaiassistant;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class UserLogin extends AppCompatActivity {
    TextView text1, text2;
    ImageView uimg;
    EditText edit1, edit2;
    Button btnlog;
public static String lid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btnlog = findViewById(R.id.btnlog);

        text2.setOnClickListener(v -> {
            Intent in = new Intent(getApplicationContext(), UserReg.class);
            startActivity(in);
        });

        btnlog.setOnClickListener(v -> {
            String username = edit1.getText().toString();
            String password = edit2.getText().toString();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(UserLogin.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
            } else {
                userLog(username, password);
            }
        });
    }

    private void userLog(String name, String pass) {
//        new Thread(() -> {
//            try {
//                URL url = new URL("http://192.168.1.14/KrishiBharti/userLog.php");
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setDoInput(true);
//                connection.setDoOutput(true);
//                connection.setRequestMethod("POST");
//                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//
//                String postData = "uname=" + URLEncoder.encode(name, "UTF-8") + "&upass=" + URLEncoder.encode(pass, "UTF-8");
//
//                try (OutputStream outputStream = connection.getOutputStream()) {
//                    outputStream.write(postData.getBytes(StandardCharsets.UTF_8));
//                }
//
//                int responseCode = connection.getResponseCode();
//                if (responseCode == HttpURLConnection.HTTP_OK) {
//                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
//                        String line;
//                        StringBuilder response = new StringBuilder();
//                        while ((line = reader.readLine()) != null) {
//                            response.append(line);
//                        }
//                        String userCode = extractUserCode(response.toString());
//                        if (userCode != null) {
//                            Log.d("UserCode", "User Code: " + userCode);
//                            runOnUiThread(() -> { // Update UI on the main thread
//                                Toast.makeText(UserLogin.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                                Intent in = new Intent(getApplicationContext(), UserDashBoard.class);
//                                in.putExtra("userCode", userCode);
//
//
//                                startActivity(in);
//                            });
//                        } else {
//                            Log.d("UserCode", "User code not found in response.");
//                            runOnUiThread(() -> Toast.makeText(UserLogin.this, "Login Failed. Invalid credentials or user code not received.", Toast.LENGTH_SHORT).show()); // Handle missing user code
//                        }
//                    }
//                } else {
//                    Log.d("Saved", "Failed: " + responseCode);
//                    runOnUiThread(() -> Toast.makeText(UserLogin.this, "Login Failed. Server Error: " + responseCode, Toast.LENGTH_SHORT).show()); // Handle server error
//                }
//                connection.disconnect();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//                Log.e("Error", "Error during login: " + e.getMessage());
//                runOnUiThread(() -> Toast.makeText(UserLogin.this, "Login Failed. Network Error: " + e.getMessage(), Toast.LENGTH_SHORT).show()); // Handle network error
//            }
//        }).start();
        HashMap<String, String> param = new HashMap<String, String>();

        param.put("username",name);
        param.put("password", pass);



        String id = Network.connect("http://" + Network.IP
                + "/userLog.php", param);
        id = id.trim();
        lid=id;
        if (id.equals("0")) {
            Toast.makeText(getApplicationContext(),
                            " Login Unsuccessfull ", Toast.LENGTH_LONG)
                    .show();
        } else if (!id.equals("0")) {
            Toast.makeText(getApplicationContext(),
                    " Login Successfull ", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(),
                    UserDashBoard.class);
            startActivity(intent);
            finish();

        }
    }

    private String extractUserCode(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            if (jsonObject.has("userCode")) {
                return jsonObject.getString("userCode");
            }
        } catch (JSONException e) {
            Log.e("JSON Error", "Error parsing JSON: " + e.getMessage());
        }
        return null;
    }
}