/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerobump;

import java.io.IOException;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author tarun
 */
public class ZeroBump {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String url = "https://zerofinancial.com/api/v1/user/";
        JSONObject jo = new JSONObject();
        jo.put("email", "test2@saimorar.com");
        jo.put("access_code","DOLLAR23673");
        jo.put("campaign", "");
        jo.put("is_mobile", "false");
        jo.put("source", "t.co");
        
        JSONArray ja = new JSONArray();
        ja.put(jo);
        
        Document doc = Jsoup.connect(url)
                .header("authority", "zerofinancial.com")
                .header("method", "POST")
                .ignoreContentType(true)
                .ignoreHttpErrors(true)
                .requestBody(ja.toString())
                .post();
        System.out.println(doc.body());
                
                
                
    }
    
}
