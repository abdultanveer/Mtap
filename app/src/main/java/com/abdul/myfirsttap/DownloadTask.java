package com.abdul.myfirsttap;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class DownloadTask extends AsyncTask<String,Integer,Void> {
    public static String TAG = DownloadTask.class.getSimpleName();

    ProgressBar mProgressBar;
    public DownloadTask(ProgressBar progressBar){
        mProgressBar = progressBar;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override //office boy
    protected Void doInBackground(String... strings) {
        Log.i(TAG,"doinbackground  url ="+strings[0]);
        mProgressBar.setProgress(50);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
