package com.goprojectstudio.jatengid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class ListSeniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_seni)

        val btn_dugderan = findViewById<CardView>(R.id.btn_dugderan)
        val btn_wayang_kulit = findViewById<CardView>(R.id.btn_wayang_kulit)

        btn_dugderan.setOnClickListener {
            val intent = Intent(this, SeniActivity::class.java)
            startActivity(intent)
        }
        btn_wayang_kulit.setOnClickListener {
            val intent = Intent(this, WayangKulitActivity::class.java)
            startActivity(intent)
        }
    }
}