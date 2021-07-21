package com.abdul.myfirsttap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {
    var data = arrayListOf<String>()
    lateinit var adapter: WordsAdapter
    lateinit var msgEditText: EditText

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
       /* data.add("first")
        data.add("second")
        data.add("third")*/

        msgEditText = findViewById(R.id.etMessage)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = WordsAdapter(data)
        recyclerView.adapter = adapter
    }

    fun updateRecyclerview(view: View) {
        var text = msgEditText.text.toString()
        //data.set(4,text)
        data.add(text)
        adapter.notifyDataSetChanged()

    }
}