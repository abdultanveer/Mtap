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

        try {

            for (int i = 1; i <100 ; i++) {
                Thread.sleep(100);
                publishProgress(i);  //office boy is keeping me posted
                //i = i+5;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }


    @Override
    protected void onProgressUpdate(Integer... progress) {
        super.onProgressUpdate(progress);
        mProgressBar.setProgress(progress[0]);

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
