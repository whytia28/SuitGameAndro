package com.example.gamesuit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gamesuit.areaMain.PemainVsPemain
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_exit.setOnClickListener(this)
        pemainvspemain.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.pemainvspemain -> {
                val moveIntent = Intent(this@MainActivity, PemainVsPemain::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_exit -> {
                finish()
            }
        }
    }

}
