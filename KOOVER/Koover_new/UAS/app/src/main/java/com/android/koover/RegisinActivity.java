package com.android.koover;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

public class RegisinActivity extends AsyncTask<String,Void,String> {
    private Context context;
    public RegisinActivity(Context context) {

        this.context = context;
    }

    protected void onPreExecute(){

    }
    @Override
    protected String doInBackground(String... arg0) {
        String hasil = "";
        try {
            String nohp = (String) arg0[1];
            String nama = (String) arg0[0];
            String password = (String) arg0[2];
            String link = "http://192.168.43.26/yrs/simpan.php?nama="+nama+"&nohp="+nohp+"&password="+password;

            HttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet();
            request.setURI(new URI(link));
            HttpResponse response = client.execute(request);
            BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            StringBuffer sb = new StringBuffer("");
            String line = "";
            while ((line = in.readLine()) != null) {
                sb.append(line);
                break;
            }
            in.close();
            hasil = sb.toString();
            return hasil;
        } catch (Exception e) {
            return new String("Exception: " + e.getMessage());
        }
    }
    @Override
    protected void onPostExecute(String result){
        if(result.length() != 0){
            Intent intent = new Intent(context, homeActivity.class);
            context.startActivity(intent);
        }
    }
}
