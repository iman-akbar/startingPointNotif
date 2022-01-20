package com.example.getnotif;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class getNotif extends NotificationListenerService {
    public static String TAG = getNotif.class.getSimpleName();

    public static void onNotificationPosted() {
    }

        @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        String data = (String) sbn.getNotification().tickerText;
        Log.d(TAG, (String) sbn.getNotification().tickerText);
        Log.i(TAG, "ID:" + sbn.getId());
        Log.i(TAG, "pengirim:" + sbn.getPackageName());
        Log.i(TAG, "pesan masuk:" + data);

        if (!data.contains("08") && !data.contains("+62")) {
            postDataUsingVolley(data, sbn.getPackageName());
        }
    }
    private void postDataUsingVolley(String name, String job) {
        Log.i("berhasil","yes");
        Log.i("berhasil",name);
        Log.i("berhasil",job);
//        String url = "http://54.251.227.51:5000/aiTest/";
//        RequestQueue queue = Volley.newRequestQueue(getNotif.this);
//        StringRequest postRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>()
//                {
//                    @Override
//                    public void onResponse(String response) {
//
//                        Log.d("dapat response", response);
//                    }
//                },
//                new Response.ErrorListener()
//                {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                        String response = null;
//                        Log.d("Error.Response", response);
//                    }
//                }
//        ) {
//            @Override
//            protected Map<String, String> getParams()
//            {
//                Map<String, String>  params = new HashMap<String, String>();
////                params.put("sender", "Alif");
////                params.put("message", "http://itsalif.info");
//
//                return params;
//            }
//        };
////        ArraySet<StringRequest> queue = null;
//        queue.add(postRequest);


        final String url = " http://54.251.169.190:8081/submit";
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("sender", job);
        params.put("messsage", name);


        RequestQueue queue = Volley.newRequestQueue(getNotif.this);
        JsonObjectRequest getRequest = new JsonObjectRequest(url, new JSONObject(params),
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        Log.i("keren", String.valueOf(response));
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
