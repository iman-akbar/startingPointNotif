package com.example.notif1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.ArraySet;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.getnotif.getNotif;

import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getNotif.TAG = getNotif.class.getSimpleName();
        getNotif.onNotificationPosted();

        Log.d("MyApp","I am here");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("masuk_enggak", "yes");
//        Log.i("berhasil", name);
//        Log.i("berhasil", job);
//        OutputStream out = null;
//        try {
//            URL url = new URL("http://54.251.250.157:5000/");
//            Log.i("mantab", "connect");
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            Log.i("mantab3", "connect");
//            out = new BufferedOutputStream(urlConnection.getOutputStream());
//            Log.i("mantab2", "connect");
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
//
////            writer.write(data);
//            writer.flush();
//            writer.close();
//            out.close();
//
//            urlConnection.connect();
//
//        } catch (Exception e) {
//            Log.i("error_message", e.getMessage());
//        }

        final String url = " http://54.251.227.51:5000/v1/mc/predict";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("content_id", "c6eEXZ");
        params.put("download_from", "S3");
        params.put("lang", "BAHASA");
        params.put("metaDataPath", ".txt");

        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
        JsonObjectRequest getRequest = new JsonObjectRequest(url, new JSONObject(params),
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        Log.i("mantab9", String.valueOf(response));
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
//                        Log.d("Error.Response", response);
                    }
                }
        ){
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("sender", "done");
                params.put("message", "yup");

                return params;
            }
        };

// add it to the RequestQueue

        queue.add(getRequest);
    }

}