package com.abdul.myfirsttap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    var countries = arrayOf("India","usa","uk")
    lateinit var tvDataReceived: TextView
    lateinit var etHome: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)  //inflating the layout xml
        etHome = findViewById(R.id.etHome)

        var adapter = ArrayAdapter<String>(this,
                                    android.R.layout.simple_list_item_1,
                                    countries)
        var countriesSpinner = findViewById<Spinner>(R.id.spinnerCountries)
        countriesSpinner.adapter = adapter

        /*tvDataReceived = findViewById(R.id.tv_dataReceived) //taking handle on the textview
        var receivedData =  intent.getStringExtra("mykey")
        tvDataReceived.text = receivedData*/
    }

    fun sendHandler(view: View) {
        var photoData = etHome.text.toString()
        var dataIntent = Intent()
        dataIntent.putExtra("img",photoData)
        setResult(RESULT_OK,dataIntent)
        finish()
    }
}