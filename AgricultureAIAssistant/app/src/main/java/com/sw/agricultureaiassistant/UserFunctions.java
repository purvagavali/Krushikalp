package com.sw.agricultureaiassistant;

import org.apache.http.NameValuePair;
import org.json.JSONObject;

import java.util.List;

public class UserFunctions
{
    private static JSONParser jsonParser;
    private static String basephpurl ="http://192.168.1.16/KrishiBharti/";
    private static String loginURL = "android_login_api/";
    private static String registerURL = "android_login_api/";
    private static String login_tag = "login";
    private static String register_tag = "register";
    public static int user_id = 0;

    public UserFunctions() {
        jsonParser = new JSONParser();
    }

    public String getResponse(String url) {
        System.out.println("url in userfunction \n =" + basephpurl + url);
        String json = jsonParser.getJsonFromUrl(basephpurl + url);
        System.out.println("\n Responce = " + json);
        return json;
    }

    public JSONObject getResponse(String url, List<NameValuePair> params) {
        JSONObject json = jsonParser.getJSONFromUrl(basephpurl + url, params);
        return json;
    }
}
