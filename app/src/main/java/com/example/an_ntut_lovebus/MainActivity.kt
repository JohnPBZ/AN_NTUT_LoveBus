package com.example.an_ntut_lovebus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.an_ntut_lovebus.fragments.FavoritesFragment
import com.example.an_ntut_lovebus.fragments.HomeFragment
import com.example.an_ntut_lovebus.fragments.SettingsFragment
import com.example.an_ntut_lovebus.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTabs()
    }
    private fun setUpTabs(){
        val adapter=ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(FavoritesFragment(),"Favorites")
        adapter.addFragment(SettingsFragment(),"Settings")
        viewPager.adapter=adapter
        tabs.setupWithViewPager(viewPager)
    }
}