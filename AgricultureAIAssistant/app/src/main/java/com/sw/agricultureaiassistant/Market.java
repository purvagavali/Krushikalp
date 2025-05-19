package com.sw.agricultureaiassistant;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Market extends AppCompatActivity {

TextView text1,text2,text3,text4,text5;
EditText edittext1,editext2,editext3,editext4;
Button btn1,imagebtn;
    private Uri imageUri;
private static final int PICK_IMAGE_REQUEST = 1;
 ImageView logo,img1;
    private static final int PICK_IMAGE = 1;
    private String imagePath = "";
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_market);
     edittext1=findViewById(R.id.edit1);
     editext2=findViewById(R.id.edit2);
     editext3=findViewById(R.id.edit3);
     editext4=findViewById(R.id.edit4);
     text1=findViewById(R.id.txt1);
     text2=findViewById(R.id.txt2);
     text3=findViewById(R.id.txt3);
     text4=findViewById(R.id.txt4);
     text5=findViewById(R.id.txt5);
     btn1=findViewById(R.id.savebtn1);
imagebtn=findViewById(R.id.imgbtn);

    // Set logo image (if it's in your drawable folder)
//    logo.setImageResource(R.drawable.logo); // Replace logo with your actual drawable name

//    ActivityResultLauncher<Intent> imagePickerLauncher = registerForActivityResult(
//            new ActivityResultContracts.StartActivityForResult(),
//            result -> {
//                if (result.getResultCode() == RESULT_OK && result.getData() != null) {
//                  imageUri = result.getData().getData();
//                    img1.setImageURI(imageUri);
//
//                    //Optionally, you can convert to Bitmap for further processing:
//                    try {
//                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
//                        // ... use the bitmap ...
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//    );
//    imagebtn.setOnClickListener(v -> {
//        Intent intent = new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//
//        imagePickerLauncher.launch(Intent.createChooser(intent, "Select Picture"));
//    });
//    btn1.setOnClickListener(v -> {
//        // Handle save button click
//        String productName = edittext1.getText().toString();
//        String productPrice = editext2.getText().toString();
//        String productDescription = editext3.getText().toString();
//        String pesticideUsed = editext4.getText().toString();
//
//        // Perform save operation (e.g., store in database, etc.)
//        // For now, just show a toast message
//        String message = "Product Name: " + productName + "\n" +
//                "Price: " + productPrice + "\n" +
//                "Description: " + productDescription + "\n" +
//                "Pesticide: " + pesticideUsed;
//
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//
//        if (imageUri != null) {
//            // You have the image URI, you can now upload it or process it as needed.
//            // Example:
//            // uploadImage(imageUri);
//        } else {
//            Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show();
//        }
//
//    });

    imagebtn.setOnClickListener(view -> {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE);
    });

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String productName = edittext1.getText().toString();
        String productPrice = editext2.getText().toString();
        String productDescription = editext3.getText().toString();
        String pesticideUsed = editext4.getText().toString();
            if (!imagePath.isEmpty() && !productName.isEmpty()) {
                uploadData(productName,productPrice,productDescription, pesticideUsed,imagePath);
            } else {
                Toast.makeText(Market.this, "Please select an image and enter text", Toast.LENGTH_SHORT).show();
            }
        }
    });
}
    //Helper function (you'll need to implement the actual upload logic)
//    private void uploadImage(Uri uri) {
//        // Implement your image upload code here (e.g., using Volley, Retrofit, etc.)
//        // This is a placeholder!
//        Toast.makeText(this, "Uploading image...", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};
            Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                imagePath = cursor.getString(columnIndex);
                cursor.close();
            }
        }
    }

    private void uploadData(String pname,String price,String pdec,String pused, String imagePath) {
        new Thread(() -> {
            try {
                File imageFile = new File(imagePath);
                String boundary = "*";
                URL url = new URL("http://192.168.1.16/KrishiBharti/uploadNotice.php");
                System.out.println("http://192.168.1.16/KrishiBharti/uploadNotice.php");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Connection", "Keep-Alive");
                connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
                DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"pname\"\r\n\r\n" + pname + "\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"price\"\r\n\r\n" + price + "\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"decs\"\r\n\r\n" + pdec +"\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"pesd\"\r\n\r\n" + pused + "\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"fid\"\r\n\r\n" + DatabaseHelper.fid + "\r\n");
                outputStream.writeBytes("--" + boundary + "\r\n");
                outputStream.writeBytes("Content-Disposition: form-data; name=\"image\"; filename=\"" + imageFile.getName() + "\"\r\n");
                outputStream.writeBytes("Content-Type: image/jpeg\r\n\r\n");

                FileInputStream fileInputStream = new FileInputStream(imageFile);
                int bytesAvailable = fileInputStream.available();
                byte[] buffer = new byte[bytesAvailable];
                fileInputStream.read(buffer);
                outputStream.write(buffer);
                System.out.println(outputStream);
                outputStream.writeBytes("\r\n--" + boundary + "--\r\n");
                fileInputStream.close();
                outputStream.flush();
                outputStream.close();

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    Log.d("Upload", "Upload successful"+responseCode);

//                    Toast.makeText(this,"Product Uploaded Successfully",Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(getApplicationContext(), Dashboard.class);
                    startActivity(in);
                } else {
                    Log.d("Upload", "Failed: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        Toast.makeText(this,"Product Uploaded Successfully",Toast.LENGTH_SHORT).show();


    }
}

