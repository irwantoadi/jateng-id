package com.goprojectstudio.jatengid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.*
import com.goprojectstudio.jatengid.adapters.ViewPagerAdapter

class ProdukActivity : AppCompatActivity() {

    lateinit var viewPager : ViewPager
    lateinit var tabs : Tab
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk)

        setUpTab()
    }

    private fun setUpTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MakananFragment(), "Makanan")
        adapter.addFragment(KerajinanFragment(), "Kerajinan")
        adapter.addFragment(PakaianFragment(), "Pakaian")

        viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = adapter



    }
}