package com.goprojectstudio.jatengid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn_kesenian = findViewById<ImageButton>(R.id.btn_kesenian)
        val btn_rumah = findViewById<ImageButton>(R.id.btn_rumah_adat)
        val btn_tarian = findViewById<ImageButton>(R.id.btn_tarian)
        val btn_produk = findViewById<ImageButton>(R.id.btn_produk)
        val btn_musik = findViewById<ImageButton>(R.id.btn_musik)
        val btn_aksara = findViewById<ImageButton>(R.id.btn_aksara)
        val btn_upload = findViewById<ImageButton>(R.id.btn_upload)
        val btn_rate = findViewById<ImageButton>(R.id.btn_rating)

        btn_kesenian.setOnClickListener {
            val intent = Intent(this, ListSeniActivity::class.java)
            startActivity(intent)
        }
        btn_rumah.setOnClickListener {
            val intent = Intent(this, ListRumahActivity::class.java)
            startActivity(intent)
        }
        btn_tarian.setOnClickListener {
            val intent = Intent(this, ListTariActivity::class.java)
            startActivity(intent)
        }
        btn_produk.setOnClickListener {
            val intent = Intent(this, ProdukActivity::class.java)
            startActivity(intent)
        }
        btn_musik.setOnClickListener {
            val intent = Intent(this, MusikActivity::class.java)
            startActivity(intent)
        }
        btn_aksara.setOnClickListener {
            val intent = Intent(this, AksaraActivity::class.java)
            startActivity(intent)
        }
        btn_upload.setOnClickListener {
            val intent = Intent(this, UploadActivity::class.java)
            startActivity(intent)
        }
        btn_rate.setOnClickListener {
            val intent = Intent(this, RateActivity::class.java)
            startActivity(intent)
        }
    }
}