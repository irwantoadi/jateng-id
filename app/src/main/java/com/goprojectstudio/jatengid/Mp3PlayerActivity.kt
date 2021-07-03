package com.goprojectstudio.jatengid

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Mp3PlayerActivity : AppCompatActivity() {

    private  lateinit var mp : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mp3_player)

        mp = MediaPlayer.create(this, R.raw.gambang_suling)
        mp.start()
    }

    override fun onBackPressed() {
        mp.stop()
        super.onBackPressed()
    }
}