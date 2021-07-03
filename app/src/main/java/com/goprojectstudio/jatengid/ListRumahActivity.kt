package com.goprojectstudio.jatengid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class ListRumahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_rumah)

        val btn_joglo = findViewById<CardView>(R.id.btn_joglo)
        btn_joglo.setOnClickListener {
            val intent = Intent(this, RumahActivity::class.java)
            startActivity(intent)
        }
    }
}