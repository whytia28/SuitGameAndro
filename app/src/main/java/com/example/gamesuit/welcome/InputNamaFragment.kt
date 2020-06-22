package com.example.gamesuit.welcome

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gamesuit.MainActivity
import com.example.gamesuit.R
import kotlinx.android.synthetic.main.fragment_input_nama.*
import java.util.*

class InputNamaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_input_nama, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            intent.putExtra(
                "nama pemain", input_nama.text.toString().toUpperCase(Locale.ROOT)
                )
            startActivity(intent)
            activity?.finish()
        }
    }
}