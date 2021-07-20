package com.abdul.myfirsttap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class HomeActivity : AppCompatActivity() {
    var TAG = HomeActivity::class.simpleName
    var countries = arrayOf("India","usa","uk")
    lateinit var tvDataReceived: TextView
    lateinit var etHome: EditText
    lateinit var sendButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // var name = savedInstanceState?.getString("name")
        setContentView(R.layout.activity_home)  //inflating the layout xml
        etHome = findViewById(R.id.etHome)
        Log.i(TAG,"onCreate")


        var adapter = ArrayAdapter<String>(this,
                                    android.R.layout.simple_list_item_1,
                                    countries)
        var countriesSpinner = findViewById<Spinner>(R.id.spinnerCountries)
        countriesSpinner.adapter = adapter

        /*tvDataReceived = findViewById(R.id.tv_dataReceived) //taking handle on the textview
        var receivedData =  intent.getStringExtra("mykey")
        tvDataReceived.text = receivedData*/
    }

    override fun onStart() {
        super.onStart()
        sendButton = findViewById(R.id.btnSend)
        registerForContextMenu(sendButton)
        Log.i(TAG,"onStart--get location")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume--- restore data")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onpause--- saving app state")

    }


    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onstop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"ondestroy")

    }


    fun sendHandler(view: View) {
        var photoData = etHome.text.toString()
        var dataIntent = Intent()
        dataIntent.putExtra("img",photoData)
        setResult(RESULT_OK,dataIntent)
        finish()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putString("name","abdul")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         super.onCreateOptionsMenu(menu)
        var menuInflater = menuInflater
        menuInflater.inflate(R.menu.home_activity_menu,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.fItem -> {Toast.makeText(this,"first item",Toast.LENGTH_SHORT).show()}
            R.id.sItem -> {Toast.makeText(this,"second item",Toast.LENGTH_SHORT).show()}

        }
        return true
    }


    override fun onCreateContextMenu(menu: ContextMenu?,v: View?,menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.home_activity_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
         super.onContextItemSelected(item)
        when(item.itemId){
            R.id.fItem -> {Toast.makeText(this,"first context item",Toast.LENGTH_SHORT).show()}
            R.id.sItem -> {Toast.makeText(this,"second context item",Toast.LENGTH_SHORT).show()}

        }
        return true
    }
}