package com.abdul.myfirsttap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
    }

    fun handleServices(view: View) {

        when(view.id){
            R.id.btnStart -> {
                var serviceIntent = Intent(this,DunzoService::class.java)
                serviceIntent.putExtra("mykey","my value")
                startService(serviceIntent)
            }
            R.id.btnStop ->{
                var serviceIntent = Intent(this,DunzoService::class.java)
                stopService(serviceIntent)
            }
        }
    }
}