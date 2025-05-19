package com.sw.agricultureaiassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class WeatherPrediction extends AppCompatActivity {

    ImageView imageView;
    private TextView tv_show;
    private EditText et_getPlace;
    private Button bt_send_data;
    int ih;
    private GPSTracker gps;
    private double lat;
    private double lng;
    String id,weather,temp,humidity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_prediction);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


        et_getPlace=(EditText)findViewById(R.id.et_place);
        bt_send_data=(Button)findViewById(R.id.bt_send_data);
        tv_show = (TextView) findViewById(R.id.tv_show);
        id = getIntent().getStringExtra("id");
        imageView = (ImageView) findViewById(R.id.imgPreview1);

//		if(!et_getPlace.getText().toString().isEmpty())
//		{
        gps = new GPSTracker(WeatherPrediction.this);
        // check if GPS enabled
        if(gps.canGetLocation()){

            lat = gps.getLatitude();
            lng = gps.getLongitude();

        }else{

            gps.showSettingsAlert();
        }


        bt_send_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String address  = ((EditText)findViewById(R.id.et_place)).getText().toString();
                Geocoder geocoder = new Geocoder(WeatherPrediction.this, Locale.getDefault());
                // TODO Auto-generated method stub
                try {
                    List<Address> fromLocationName = geocoder.getFromLocationName(address, 1);
                    System.out.println(address);
                    System.out.println(fromLocationName.size());
                    if(fromLocationName.size() > 0){

                        // TODO Auto-generated method stub
                        UserFunctions userFunction = new UserFunctions();

                        String url="weather.php?lattitude="+fromLocationName.get(0).getLatitude()+"&longitude="+fromLocationName.get(0).getLongitude()+"";
                        System.out.println("url="+url);
                        weather= userFunction.getResponse(url);
                        System.out.println("response="+weather);
                        HashMap< String, String> param = new HashMap<String, String>();
                        param.put("lattitude", ""+fromLocationName.get(0).getLatitude());
                        param.put("longitude", ""+fromLocationName.get(0).getLongitude());
//						String weather=Network.connect("http://"+Network.IP+"/locationbasedservices/pages/weather", param);
                        setImage(weather);

                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });


    }

    private void setImage(String weather) {
        // TODO Auto-generated method stub

        weather=weather.trim();

        String section[] = weather.split("-");
        weather=section[0];
        double kelvin = Double.parseDouble(section[1]) ;//- 272.15;
        temp= String.format("%.2f", kelvin);
        tv_show.setText(" à¤¹à¤µà¤¾à¤®à¤¾à¤¨ : "+weather+"\n"+" Weather Condition:"+temp);
        if(weather.equalsIgnoreCase("Cloudy")||weather.equalsIgnoreCase("partly Cloudy")||weather.equalsIgnoreCase("foggy")){
            System.out.println("in cloudy");
            imageView.setImageResource(R.drawable.cloudy);
            tv_show.setText(" à¤¹à¤µà¤¾à¤®à¤¾à¤¨ : "+weather+"\n"+" Weather Condition : "+temp+" Â°C\n");
        }

        else if(weather.equalsIgnoreCase("Stormy")){
            System.out.println("in stormy");
            imageView.setImageResource(R.drawable.stormy);
            tv_show.setText(" à¤¹à¤µà¤¾à¤®à¤¾à¤¨ : "+weather+"\n"+" Weather Temp : "+temp+" Â°C\n");
        }
        else if(weather.equalsIgnoreCase("Light Rain")||weather.equalsIgnoreCase("Rain")||weather.equalsIgnoreCase("Clouds")){
            System.out.println("in rain");
            imageView.setImageResource(R.drawable.rainy);
            tv_show.setText(" Weather Condition : "+weather+"\n"+" Weather Temp : "+temp+" Â°C\n");
        }
        else if(weather.equalsIgnoreCase("Haze")){
            System.out.println("in Haze");
            imageView.setImageResource(R.drawable.haze);
            tv_show.setText(" Weather Condition : "+weather+"\n"+" Weather Temp : "+temp+" Â°C\n");
        }
        else if(weather.equalsIgnoreCase("Sunny")||weather.equalsIgnoreCase("Mostly Sunny")||weather.equalsIgnoreCase("clear")){
            System.out.println("in sunny");
            imageView.setImageResource(R.drawable.sunny);
            tv_show.setText(" Weather Condition : "+weather+"\n"+" Weather Temp : "+temp+" Â°C\n");
        }else
        {
            imageView.setImageResource(R.drawable.no_image);
            tv_show.setText(" Weather Condition : "+weather+"\n"+"  Weather Temp : "+temp+" Â°C\n");
        }
    }

}