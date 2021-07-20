package com.abdul.myfirsttap

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText //declaration
    lateinit var textView: TextView
    var TAG = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName) //initialization -- taking handle edittext
        textView = findViewById(R.id.tvMain)
        Log.i(TAG,"i am in onCreate ")
        var a = 10 //val is final variable
        a =12
    }

    fun clickHandler(view: View) {
        when (view.id) { //get the id of the view that was clicked
            R.id.buttonLogin -> {
                startHome()
            }
            R.id.buttonCancel -> {
                createAlarm("wake up",4,0)
            }
            R.id.btn_google -> {openGoogle()}
            R.id.btnDial ->{ openDialer()}
            R.id.btn_Safr -> { safr()}

            //demoExtract()
            // startHome()
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 123 && resultCode == RESULT_OK){
            var tvResult = findViewById<TextView>(R.id.tvResult)
            tvResult.text = data?.getStringExtra("img")
        }

    }


    private fun safr() {
        var intent = Intent(this,HomeActivity::class.java)
        startActivityForResult(intent,123)
    }

    fun openGoogle(){
        var gIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"))
        startActivity(gIntent)
    }


    fun openDialer(){
        var dIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:9876543"))
        startActivity(dIntent)
    }

        fun createAlarm(message: String, hour: Int, minutes: Int) {
            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_MESSAGE, message)
                putExtra(AlarmClock.EXTRA_HOUR, hour)
                putExtra(AlarmClock.EXTRA_MINUTES, minutes)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }


    private fun startDialer(){
        //wa-ne:/1234/message
        var dIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"))
        startActivity(dIntent)
    }

    private fun startHome() {
        var value = etName.text.toString()

        var hIntent: Intent
        hIntent = Intent(this, HomeActivity::class.java).apply {
            putExtra("mykey", value)
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