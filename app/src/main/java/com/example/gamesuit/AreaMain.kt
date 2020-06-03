package com.example.gamesuit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_area_main.*

class AreaMain : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME1 = "extra_name1"
        const val EXTRA_NAME2 = "extra_name2"

    }

    private var pilihanSatu: String? = ""
    private var pilihanDua: String = ""
    private var namaPemain1: String = ""
    private var namaPemain2: String = ""

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
            batu1.foreground = resources.getDrawable(R.drawable.overlay, null)
        }
        kertas1.setOnClickListener {
            pilihanSatu = "kertas"
            showResult()
            kertas1.foreground = resources.getDrawable(R.drawable.overlay, null)
        }
        gunting1.setOnClickListener {
            pilihanSatu = "gunting"
            showResult()
            gunting1.foreground = resources.getDrawable(R.drawable.overlay, null)
        }
        batu2.setOnClickListener {
            pilihanDua = "batu"
            showResult()
            batu2.foreground = resources.getDrawable(R.drawable.overlay, null)
        }
        kertas2.setOnClickListener {
            pilihanDua = "kertas"
            showResult()
            kertas2.foreground = resources.getDrawable(R.drawable.overlay, null)
        }
        gunting2.setOnClickListener {
            pilihanDua = "gunting"
            showResult()
            gunting2.foreground = resources.getDrawable(R.drawable.overlay, null)
        }
        main_lagi.setOnClickListener {
            startNew()
        }
    }

    private fun showResult() {
        var pemenang : String = ""
        if (pilihanSatu != "" && pilihanDua != "") {
            val control = Controler()
            val hasilMain = control.caraMain(pilihanSatu, pilihanDua)
            if (hasilMain == "pemain 1 menang") {
                pemenang = "$namaPemain1 MENANG"
//                hasil.text = "$namaPemain1 MENANG"
            } else if (hasilMain == "pemain 2 menang") {
                pemenang = "$namaPemain2 MENANG"
//                hasil.text = "$namaPemain2 MENANG"
            } else {
                pemenang = "DRAW"
//                hasil.text = "DRAW"
            }
//            hasil.visibility = View.VISIBLE
            val builder = AlertDialog.Builder(this)
            builder.setTitle("HASIL")
            builder.setMessage("$pemenang")
            builder.setPositiveButton("OK", null)
            builder.create().show()
        }
//        else {
//            Toast.makeText(this, "Kedua pemain harus memilih", Toast.LENGTH_SHORT).show()
//        }

    }

    private fun startNew() {
//        hasil.visibility = View.GONE
        pilihanSatu = ""
        pilihanDua = ""
        batu1.foreground = null
        batu2.foreground = null
        kertas1.foreground = null
        kertas2.foreground = null
        gunting1.foreground = null
        gunting2.foreground = null
    }
}
