package com.example.gamesuit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.gamesuit.areaMain.PemainVsCpu
import com.example.gamesuit.areaMain.PemainVsPemain
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity(), View.OnClickListener  {


    var namaPemain: String? = ""

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaPemain = intent.getStringExtra("nama pemain")
        tv_pemain.text = "$namaPemain vs PEMAIN"
        tv_cpu.text = "$namaPemain vs CPU"

        btn_exit.setOnClickListener(this)
        pemainvspemain.setOnClickListener(this)
        pemainvscpu.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.pemainvspemain -> {
                val moveIntent = Intent(this@MainActivity, PemainVsPemain::class.java)
                startActivity(moveIntent)
            }
            R.id.pemainvscpu -> {
                val moveIntent = Intent(this@MainActivity, PemainVsCpu::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_exit -> {
                finish()
            }
        }
    }
}
