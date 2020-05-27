package com.example.gamesuit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.TintableBackgroundView
import kotlinx.android.synthetic.main.activity_area_main.*

class AreaMain : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME1 = "extra_name1"
        const val EXTRA_NAME2 = "extra_name2"

    }

    var pilihanSatu: String = ""
    var pilihanDua: String = ""
    var namaPemain1: String = ""
    var namaPemain2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_main)

        namaPemain1 = intent.getStringExtra(EXTRA_NAME1)
        namaPemain2 = intent.getStringExtra(EXTRA_NAME2)
        pemain1.text = namaPemain1
        pemain2.text = namaPemain2

        batu1.setOnClickListener {
            pilihanSatu = "batu"
            showResult()
        }
        kertas1.setOnClickListener {
            pilihanSatu = "kertas"
            showResult()
        }
        gunting1.setOnClickListener {
            pilihanSatu = "gunting"
            showResult()
        }
        batu2.setOnClickListener {
            pilihanDua = "batu"
            showResult()
        }
        kertas2.setOnClickListener {
            pilihanDua = "kertas"
            showResult()
        }
        gunting2.setOnClickListener {
            pilihanDua = "gunting"
            showResult()
        }
        reset.setOnClickListener {
            startNew()
        }
    }

    fun showResult() {
        if (pilihanSatu != "" && pilihanDua != "") {
            val control = Controler()
            val hasilMain = control.caraMain(pilihanSatu, pilihanDua)
            if (hasilMain == "pemain 1 menang") {
                hasil.text = "$namaPemain1 MENANG"
            } else if (hasilMain == "pemain 2 menang") {
                hasil.text = "$namaPemain2 MENANG"
            } else {
                hasil.text = "DRAW"
            }
            hasil.visibility = View.VISIBLE
        } else {
            Toast.makeText(this, "Kedua pemain harus meilih", Toast.LENGTH_SHORT).show()
        }

    }

    fun startNew() {
        hasil.visibility = View.GONE
        pilihanSatu = ""
        pilihanDua = ""
    }


}
