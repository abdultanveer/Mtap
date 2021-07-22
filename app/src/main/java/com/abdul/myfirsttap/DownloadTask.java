package com.abdul.myfirsttap;

import android.os.AsyncTask;
import android.util.Log;

public class DownloadTask extends AsyncTask<String,Integer,Void> {
    public static String TAG = DownloadTask.class.getSimpleName();

    @Override //office boy
    protected Void doInBackground(String... strings) {
        Log.i(TAG,"doinbackground  url ="+strings[0]);
        return null;
    }
}
