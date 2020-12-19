package com.example.an_ntut_lovebus

import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.an_ntut_lovebus.fragments.FavoritesFragment
import com.example.an_ntut_lovebus.fragments.HomeFragment
import com.example.an_ntut_lovebus.fragments.SettingsFragment
import com.example.an_ntut_lovebus.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_bus_information.*

class BusInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_information)
        setUpTabs()
        val actionbar = supportActionBar
        actionbar!!.title = "公車動態介面"
        actionbar.setDisplayHomeAsUpEnabled(true)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.lunch,
            android.R.layout.simple_spinner_dropdown_item
        )
        spinner.adapter = adapter
    }
    private fun setUpTabs(){
        val adapter=ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "222")
        adapter.addFragment(FavoritesFragment(), "72")
        viewPager.adapter=adapter
        tabs.setupWithViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}