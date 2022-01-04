package com.example.notif1;

import android.util.Log;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import androidx.collection.ArraySet;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class testing {
//    public void test() {
//        Log.i("berhasil", "yes");
////        Log.i("berhasil", name);
////        Log.i("berhasil", job);
//        String url = "http://54.251.227.51:5000/aiTest/";
////        RequestQueue queue = Volley.newRequestQueue(getNotif.this);
//        StringRequest postRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        Log.d("dapat response", response);
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                        String response = null;
//                        Log.d("Error.Response", response);
//                    }
//                }
//        ) {
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<String, String>();
////                params.put("sender", "Alif");
////                params.put("message", "http://itsalif.info");
//
//                return params;
//            }
//        };
////        ArraySet<StringRequest> queue = null;
//        ArraySet<StringRequest> queue;
//        queue.add(postRequest);
//    }
}