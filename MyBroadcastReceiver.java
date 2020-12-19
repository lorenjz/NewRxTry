package com.mine.newrxtry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if("com.mine.EXAMPLE_ACTION".equals(intent.getAction())){
            String receivedText = intent.getStringExtra("com.mine.EXTRA_TEXT");
            Toast.makeText(context, receivedText, Toast.LENGTH_LONG).show();
        }
    }
}
