package com.abdul.myfirsttap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var tvDataReceived: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)  //inflating the layout xml

        tvDataReceived = findViewById(R.id.tv_dataReceived) //taking handle on the textview
        var receivedData =  intent.getStringExtra("mykey")
        tvDataReceived.text = receivedData
    }
}