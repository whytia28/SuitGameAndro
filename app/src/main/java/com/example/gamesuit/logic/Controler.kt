package com.example.gamesuit.logic


class Controler {
    fun caraMain(
         pilihanSatu: String?, pilihanDua: String?
    ):String{
        return if (pilihanSatu == "batu" && pilihanDua == "gunting"
            || pilihanSatu == "gunting" && pilihanDua == "kertas"
            || pilihanSatu == "kertas" && pilihanDua == "batu"
        ) "pemain 1 menang"
        else if (pilihanDua == "batu" && pilihanSatu == "gunting"
            || pilihanDua == "gunting" && pilihanSatu == "kertas"
            || pilihanDua == "kertas" && pilihanSatu == "batu"
        ) "pemain 2 menang"
        else "draw"
    }
}