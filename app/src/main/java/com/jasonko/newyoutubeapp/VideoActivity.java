package com.jasonko.newyoutubeapp;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by kolichung on 5/1/15.
 */


public class VideoActivity extends Activity {

    YoutubeVideo mYoutubeVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_video);

        new DownloadVideoTask().execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class DownloadVideoTask extends AsyncTask {

        @Override
        protected Object doInBackground(Object[] params) {
            mYoutubeVideo = VideoAPI.getYoutubeVideoByID("");
            return null;
        }

        @Override
        protected void onPostExecute(Object result) {

        }
    }
}
