package com.abdul.myfirsttap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText //declaration
    lateinit var textView: TextView
    var TAG = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName) //initialization
        textView = findViewById(R.id.tvMain)
        Log.i(TAG,"i am in onCreate ")
        var a = 10 //val is final variable
        a =12
    }

    fun clickHandler(view: View) {
        //demoExtract()
        var hIntent: Intent
        var value = etName.text.toString()

        hIntent = Intent(this,HomeActivity::class.java).apply {
            putExtra("mykey",value)
        }
        startActivity(hIntent)
    }

    private fun demoExtract() {
        var name = etName.text.toString()
        textView.setText(name)
        var d = 30
        var c = 10 + 20 + d
        var e = add(10, 20)
        // throw NullPointerException()
        Log.e(TAG, "i am in clickHandler ")

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }

    /**
     * this method adds 2 nos and return result
     */
    fun add(fNo: Int, sNo:Int):Int {
        Log.v(TAG,"i am in add ")

        for (i in 1..10){
            println(i)
        }

        return fNo + sNo
    }


}