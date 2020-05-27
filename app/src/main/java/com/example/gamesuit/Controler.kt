package com.example.gamesuit

import kotlinx.android.synthetic.main.activity_area_main.*

class Controler {
    fun caraMain(
         pilihanSatu: String, pilihanDua: String
    ):String{
        if (pilihanSatu == "batu" && pilihanDua == "gunting"
            || pilihanSatu == "gunting" && pilihanDua == "kertas"
            || pilihanSatu == "kertas" && pilihanDua == "batu"
        ) return "pemain 1 menang"
        else if (pilihanDua == "batu" && pilihanSatu == "gunting"
            || pilihanDua == "gunting" && pilihanSatu == "kertas"
            || pilihanDua == "kertas" && pilihanSatu == "batu"
        ) return  "pemain 2 menang"
        else return "draw"
    }
}