package com.example.recyclerviewjanu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bidadariList = listOf<Bidadari>(
            Bidadari(
                R.drawable.jihyo,
                nameBidadari = "Park-Jihyo",
                descriptionBidadari = "Penyanyi Cantik dan Berbakatt"
            ),
            Bidadari(
                R.drawable.suzy,
                nameBidadari = "Bae-Suzy",
                descriptionBidadari = "Aktris yang menawannn"
            ),
            Bidadari(
                R.drawable.jieun,
                nameBidadari = "Ji-Eun/IU",
                descriptionBidadari = "Penyanyi dan Aktris yang Mempesonaaa"
            ),
            Bidadari(
                R.drawable.lisa,
                nameBidadari = "Lisa Manoban",
                descriptionBidadari = "Rapper sekaligus Dancer yang Totalsitass"
            ),
            Bidadari(
                R.drawable.ryujin,
                nameBidadari = "Shin-Ryujin",
                descriptionBidadari = "Penyanyi dan Rapper yang Adorablee"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_bidadari)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BidadariAdapter(this,bidadariList){

        }
    }
}