package com.example.gamesuit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener(this)
        btn_exit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_start -> {
                val moveIntent = Intent(this@MainActivity, AreaMain::class.java)
                moveIntent.putExtra(
                    AreaMain.EXTRA_NAME1,
                    inputpemain1.text.toString().toUpperCase()
                )
                moveIntent.putExtra(
                    AreaMain.EXTRA_NAME2,
                    inputpemain2.text.toString().toUpperCase()
                )
                startActivity(moveIntent)
            }

            R.id.btn_exit -> {
                finish()
            }
        }
    }

}
