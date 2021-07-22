package com.abdul.myfirsttap

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

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
        when (view.id) {
            R.id.btnDownload -> {
                var downloadTask = DownloadTask(progressBar)
                downloadTask.execute("http://downloadUrl.com")
            }
            R.id.btn_notif -> {
                createNotificationChannel()
                showNotification()}
        }

    }



    private fun showNotification() {
        val intent = Intent(this, RecyclerviewActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, 0)

        var builder = NotificationCompat.Builder(this, "abduls channel")
            .setSmallIcon(R.drawable.ic_baseline_thumb_up_24)
            .setContentTitle("textTitle")
            .setContentText("textContent")
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)) {
            // notificationId is a unique int for each notification that you must define
            notify(123, builder.build())
        }
    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("abduls channel", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}