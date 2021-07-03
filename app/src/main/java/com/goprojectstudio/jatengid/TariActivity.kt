package com.goprojectstudio.jatengid

import android.R
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class TariActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.goprojectstudio.jatengid.R.layout.activity_tari)

        val videoView = findViewById<VideoView>(com.goprojectstudio.jatengid.R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" +
                com.goprojectstudio.jatengid.R.raw.video_tari))
        videoView.start()
    }
}