//package com.sw.agricultureaiassistant;
//
////package com.sw.digitalnoticeproject;
//
////import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.database.Cursor;
//import android.net.Uri;
//import android.os.Bundle;
//import android.provider.MediaStore;
//import android.util.Log;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.io.DataOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class UploadNotice extends AppCompatActivity {
//    private static final int PICK_IMAGE = 1;
//    private String imagePath = "";
//    private EditText editText;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_upload_notice);
//
//        Button selectImageButton = findViewById(R.id.selectImageButton);
//        Button uploadButton = findViewById(R.id.uploadButton);
//        editText = findViewById(R.id.editText);
//
//        selectImageButton.setOnClickListener(view -> {
//            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//            startActivityForResult(intent, PICK_IMAGE);
//        });
//
//        uploadButton.setOnClickListener(view -> {
//            String text = editText.getText().toString();
//            if (!imagePath.isEmpty() && !text.isEmpty()) {
//                uploadData(text, imagePath);
//            } else {
//                Toast.makeText(this, "Please select an image and enter text", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null) {
//            Uri selectedImage = data.getData();
//            String[] filePathColumn = {MediaStore.Images.Media.DATA};
//            Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
//            if (cursor != null) {
//                cursor.moveToFirst();
//                int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
//                imagePath = cursor.getString(columnIndex);
//                cursor.close();
//            }
//        }
//    }
//
//    private void uploadData(String text, String imagePath) {
//        new Thread(() -> {
//            try {
//                File imageFile = new File(imagePath);
//                String boundary = "*";
//                URL url = new URL("http://192.168.1.36/DigitalNoticeBoard/android/uploadNotice.php");
//                System.out.println("http://192.168.1.36/DigitalNoticeBoard/android/uploadNotice.php");
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setDoInput(true);
//                connection.setDoOutput(true);
//                connection.setRequestMethod("POST");
//                connection.setRequestProperty("Connection", "Keep-Alive");
//                connection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
//                DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
//                outputStream.writeBytes("--" + boundary + "\r\n");
//                outputStream.writeBytes("Content-Disposition: form-data; name=\"text\"\r\n\r\n" + text + "\r\n");
//                outputStream.writeBytes("--" + boundary + "\r\n");
//                outputStream.writeBytes("Content-Disposition: form-data; name=\"image\"; filename=\"" + imageFile.getName() + "\"\r\n");
//                outputStream.writeBytes("Content-Type: image/jpeg\r\n\r\n");
//
//                FileInputStream fileInputStream = new FileInputStream(imageFile);
//                int bytesAvailable = fileInputStream.available();
//                byte[] buffer = new byte[bytesAvailable];
//                fileInputStream.read(buffer);
//                outputStream.write(buffer);
//
//                outputStream.writeBytes("\r\n--" + boundary + "--\r\n");
//                fileInputStream.close();
//                outputStream.flush();
//                outputStream.close();
//
//                int responseCode = connection.getResponseCode();
//                if (responseCode == HttpURLConnection.HTTP_OK) {
//                    Log.d("Upload", "Upload successful"+responseCode);
//                } else {
//                    Log.d("Upload", "Failed: " + responseCode);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }).start();
//
//
//    }
//}