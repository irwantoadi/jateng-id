package com.goprojectstudio.jatengid

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class TariBedhayaKetawangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tari_bedhaya_ketawang)

        val videoView = findViewById<VideoView>(com.goprojectstudio.jatengid.R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" +
                com.goprojectstudio.jatengid.R.raw.tari_bedhaya_ketawang))
        videoView.start()
    }
}