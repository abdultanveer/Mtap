package com.abdul.myfirsttap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class AsyncActivity : AppCompatActivity() {
    lateinit var progressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)
        progressBar = findViewById(R.id.progressBar)
        progressBar.setProgress(65)
    }
}