package com.goprojectstudio.jatengid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_search = findViewById<Button>(R.id.btn_search)
        val layout_semarang = findViewById<LinearLayout>(R.id.layout_semarang)
        val title_semarang = findViewById<ImageButton>(R.id.title_semarang)
        val maps = findViewById<ImageButton>(R.id.maps)
        btn_search.setOnClickListener {
            layout_semarang.visibility = View.VISIBLE
        }
        title_semarang.setOnClickListener {
            layout_semarang.visibility = View.GONE
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        maps.setOnClickListener {
            layout_semarang.visibility = View.GONE
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }

    var doubleBackToExitOnce:Boolean = false

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true
        Toast.makeText(this, "Tekan tombol kembali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        },2000)
    }
}