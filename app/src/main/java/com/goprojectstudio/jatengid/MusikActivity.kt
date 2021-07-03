package com.goprojectstudio.jatengid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MusikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musik)

        val btn_btn_mix_saya = findViewById<ImageButton>(R.id.btn_mix_saya)
        btn_btn_mix_saya.setOnClickListener {
            val intent = Intent(this, Mp3PlayerActivity::class.java)
            startActivity(intent)
        }

        val btn_didi_kempot = findViewById<ImageButton>(R.id.btn_didi_kempot)
        btn_didi_kempot.setOnClickListener {
            val intent = Intent(this, Mp3PlayerActivity::class.java)
            startActivity(intent)
        }

        val btn_play = findViewById<ImageButton>(R.id.btn_play)
        btn_play.setOnClickListener {
            val intent = Intent(this, Mp3PlayerActivity::class.java)
            startActivity(intent)
        }
    }
}