package com.abdul.myfirsttap

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SmsReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context,"abdul u 've an sms",Toast.LENGTH_SHORT).show()
    }
}