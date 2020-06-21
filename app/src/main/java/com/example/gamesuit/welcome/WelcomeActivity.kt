package com.example.gamesuit.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gamesuit.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val mFragmentManager = supportFragmentManager
        val mPemainFragment = PemainFragment()
        val fragment = mFragmentManager.findFragmentByTag(PemainFragment::class.java.simpleName)

        if (fragment !is PemainFragment) {
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mPemainFragment, PemainFragment::class.java.simpleName)
                .commit()
        }
    }
}