package com.example.hector.reproduccionvideo;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView_video);

        Uri path = Uri.parse("android.resource://com.example.hector.reproduccionvideo/"
                + R.raw.videito);

        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);

        videoView.setVideoURI(path);
        videoView.start();
    }
}
