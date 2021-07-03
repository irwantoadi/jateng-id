package com.goprojectstudio.jatengid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class ListTariActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_tari)

        val btn_tari_gambang = findViewById<CardView>(R.id.btn_tari_gambang)
        btn_tari_gambang.setOnClickListener {
            val intent = Intent(this, TariActivity::class.java)
            startActivity(intent)
        }
        val btn_tari_bedhaya = findViewById<CardView>(R.id.btn_tari_bedhaya)
        btn_tari_gambang.setOnClickListener {
            val intent = Intent(this, TariBedhayaKetawangActivity::class.java)
            startActivity(intent)
        }
    }
}