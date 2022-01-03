package com.example.notif1;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class getNotif extends NotificationListenerService {
    public static String TAG = getNotif.class.getSimpleName();

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        String data = (String) sbn.getNotification().tickerText;
        Log.d(TAG, (String) sbn.getNotification().tickerText);
        Log.i(TAG, "ID:" + sbn.getId());
        Log.i(TAG, "pengirim:" + sbn.getPackageName());
        Log.i(TAG, "pesan masuk:" + data);

//        for (String key : sbn.getNotification().extras.keySet()) {
//            Log.i(TAG, key + "=" + sbn.getNotification().extras.get(key).toString());
//        }
    }

}
