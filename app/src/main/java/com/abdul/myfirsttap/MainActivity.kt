package com.abdul.myfirsttap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText //declaration
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName) //initialization
        textView = findViewById(R.id.tvMain)
    }

    fun clickHandler(view: View) {
        var name = etName.text.toString()
        textView.setText(name)
        var d = 30
        var c = 10+20+d
        var e = add(10,20)
        throw NullPointerException()

        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
    }

    /**
     * this method adds 2 nos and return result
     */
    fun add(fNo: Int, sNo:Int):Int {
        return fNo + sNo
    }


}