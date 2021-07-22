package com.abdul.myfirsttap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

class AsyncActivity : AppCompatActivity() {
    lateinit var progressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async)
        progressBar = findViewById(R.id.progressBar)
       // simulateDownloadProgress()
    }

    private fun simulateDownloadProgress() {
        for(i in 1..100) {

            Thread.sleep(100)
            progressBar.setProgress(i)
        }
    }

    fun handleDownload(view: View) {
       // simulateDownloadProgress()
        var downloadTask = DownloadTask(progressBar)
        downloadTask.execute("http://downloadUrl.com")

    }
}