package com.android.serkanozdemir_odev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentSecond = FirstFragment()
        val fragmentMain = MainFragment()
        openFragment(fragmentMain)
    }

    private fun openFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        manager.beginTransaction().add(R.id.main,fragment).commit()
    }
}