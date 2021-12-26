package com.example.notif1;

import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class NotificationListenerExampleService extends NotificationListenerService {
    public static String TAG = NotificationListenerExampleService.class.getSimpleName();

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {

        Log.i(TAG, "ID:" + sbn.getId());
        Log.i(TAG, "Posted by:" + sbn.getPackageName());
        Log.i(TAG, "tickerText:" + sbn.getNotification().tickerText);

        for (String key : sbn.getNotification().extras.keySet()) {
            Log.i(TAG, key + "=" + sbn.getNotification().extras.get(key).toString());
        }
    }

}
