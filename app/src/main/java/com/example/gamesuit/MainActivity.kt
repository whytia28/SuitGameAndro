package com.example.gamesuit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gamesuit.areaMain.PemainVsPemain
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_input_nama.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_exit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.pemainvspemain -> {
                val moveIntent = Intent(this@MainActivity, PemainVsPemain::class.java)
                moveIntent.putExtra(
                    PemainVsPemain.NAMA_PEMAIN_1,
                    input_nama.text.toString().toUpperCase(Locale.ROOT)
                )
                startActivity(moveIntent)
            }
            R.id.btn_exit -> {
                finish()
            }
        }
    }

}
