package com.sw.agricultureaiassistant;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CropDetection extends AppCompatActivity {
    Button btnaddpro,browse;
    private static final String newurl = "http://192.168.1.16:8084/AIPowerAgriculture/getFile";
    private static final int REQUEST_WRITE_PERMISSION = 786;
    private static final int SELECT = 1;
    private String selectedPath=null;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crop_detection);
//        etpname=(EditText)findViewById(R.id.etaddproduct_farmer);
//        etpprice=(EditText)findViewById(R.id.etaddprice_farmer);
        tv=(TextView) findViewById(R.id.tvpath);
        btnaddpro=(Button)findViewById(R.id.btnaddproductnow_farmer);
        browse=(Button)findViewById(R.id.btnbrs);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                boolean result=checkpermission();
//
                openFilePicker();
//                if(result) {
//                    openFilePicker();
//                }
            }
        });
        btnaddpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                HashMap<String, String> param = new HashMap<String, String>();
//                param.put("pname", etpname.getText().toString());
//                param.put("pprice", etpprice.getText().toString());
//                param.put("pcat", etcat.getText().toString());
//
//
//                StrictMode.ThreadPolicy sb = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//                StrictMode.setThreadPolicy(sb);
//                String id = Network.connect("http://" + Network.IP + "/addproducts.php", param);
//
//                id = id.trim();
//                if (id.equals("0")) {
//                    Toast.makeText(getApplicationContext(), "Registration unsuccessfull", Toast.LENGTH_LONG).show();
//                } else if (!id.equals("1")) {
//                    Toast.makeText(getApplicationContext(), "Registration successfull", Toast.LENGTH_LONG).show();
//                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                }




                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                        .permitAll().build();
                StrictMode.setThreadPolicy(policy);
                File photoFile=null;
                String resp="0";
                photoFile = new File(selectedPath);

                try {
                    int size,size1,size2,size3,size4;
                    size= (int) photoFile.length();

                    byte[] bytes,bytes1,bytes2,bytes3,bytes4;
                    bytes= new byte[size];

                    BufferedInputStream buf = new BufferedInputStream(new FileInputStream(photoFile));
                    buf.read(bytes, 0, bytes.length);
                    buf.close();


                    String encoded = Base64.encodeToString(bytes, Base64.DEFAULT);
                    System.err.println("encoded -> "+encoded);


                    HttpClient httpclient = new DefaultHttpClient();
                    // specify the URL you want to post to
//			System.out.println(name1+","+info+","+cat);
                    HttpPost httpPost = new HttpPost(newurl);
                    List<BasicNameValuePair> nameValuePairs = new ArrayList<BasicNameValuePair>();
                    // add an HTTP variable and value pair

//                    nameValuePairs.add(new BasicNameValuePair("pname", etpname.getText().toString()));
//                    nameValuePairs.add(new BasicNameValuePair("pprice", etpprice.getText().toString()));
//                    nameValuePairs.add(new BasicNameValuePair("pcat", etcat.getText().toString()));
//
//                    nameValuePairs.add(new BasicNameValuePair("ownerid", "1"));
                    nameValuePairs.add(new BasicNameValuePair("filename", photoFile.getName()));
                    nameValuePairs.add(new BasicNameValuePair("uploaded_file", encoded));

//                                    System.out.println("URL"+nameValuePairs);
                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    // send the variable and value, in other words post, to the URL
//			httpclient.execute(httpPost);

                    HttpResponse response = httpclient.execute(httpPost);
                    BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    StringBuffer sb = new StringBuffer("");
                    String line = "";
                    String NL = System.getProperty("line.separator");
                    while ((line = in.readLine()) != null) {
                        sb.append(line + NL);
                    }

                    in.close();
                    resp = sb.toString();

                    resp = resp.trim();
                    String sep[]=resp.split("#");
                    System.out.println(resp);
//                                    Toast.makeText(getApplicationContext(), sep[1], Toast.LENGTH_LONG).show();
                    if(sep[0].equals("1")){
//                                        im.setImageDrawable(getResources().getDrawable(R.drawable.found));
//
//                                        tvx.setText(sep[1]);
//                Intent in1=new Intent(UploadFiles.class,MainActivity.class);
                    }
                    else {

//                                        im.setImageDrawable(getResources().getDrawable(R.drawable.safe));
                    }
//                    return resp;
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

    }

    private void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, SELECT);
    }
//    public void onRequestPermissionsResult(int requestCode,  String[] permissions,  int[] grantResults) {
//        if (requestCode == REQUEST_WRITE_PERMISSION && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//            openFilePicker();
////            openFilePicker1();
//        }
//    }

    //    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == SELECT) {
                Uri selectedUri = data.getData();
//                Toast.makeText(getActivity(),"uri"+selectedUri,Toast.LENGTH_SHORT).show();
                selectedPath = getPath(selectedUri);
//                System.out.println("Path : " + selectedPath);
                tv.setText(selectedPath);
            }

//            if (requestCode == SELECT4) {
//                Uri selectedUri = data.getData();
////                Toast.makeText(getActivity(),"uri"+selectedUri,Toast.LENGTH_SHORT).show();
//                selectedPath4 = getPath(selectedUri);
//                System.out.println("Path : " + selectedPath4);
//                tv5.setText(selectedPath4);
//            }
        }


    }
    public String getPath(Uri uri) {
        String[] projection = { MediaStore.Video.Media.DATA };
        Cursor cursor = this.managedQuery(uri, projection, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
}

}