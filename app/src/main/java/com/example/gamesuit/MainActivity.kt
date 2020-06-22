package com.example.gamesuit

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.gamesuit.areaMain.PemainVsCpu
import com.example.gamesuit.areaMain.PemainVsPemain
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val NAMA_PEMAIN_1 = "extra_name1"
    }

    var namaPemain1: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaPemain1 = intent.getStringExtra(NAMA_PEMAIN_1)
        tv_pemain.text = "$namaPemain1 vs PEMAIN"
        tv_cpu.text = "$namaPemain1 vs CPU"

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
                exitProcess(1)
            }
        }
    }

}
