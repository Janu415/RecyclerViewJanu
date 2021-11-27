package com.example.recyclerviewjanu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BidadariAdapter(private val context: Context, private val bidadari: List<Bidadari>, val lister: (Bidadari) -> Unit)
    : RecyclerView.Adapter<BidadariAdapter.BidadariViewHolder>() {

    class BidadariViewHolder(view: View) : RecyclerView.ViewHolder(view) {

          val imgBidadari = view.findViewById<ImageView>(R.id.img_item_photo)
          val nameBidadari = view.findViewById<TextView>(R.id.tv_item_name)
          val descriptionBidadari = view.findViewById<TextView>(R.id.tv_item_description)

          fun bindView(bidadari: Bidadari, listener: (Bidadari) -> Unit){
              imgBidadari.setImageResource(bidadari.imgBidadari)
              nameBidadari.text = bidadari.nameBidadari
              descriptionBidadari.text = bidadari.descriptionBidadari
          }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BidadariViewHolder {
            return BidadariViewHolder(
                LayoutInflater.from(context).inflate(R.layout.item_bidadari, parent, false)
            )
        }

        override fun onBindViewHolder(holder: BidadariViewHolder, position: Int) {
            holder.bindView(bidadari[position], lister)
        }

        override fun getItemCount(): Int = bidadari.size
        }
