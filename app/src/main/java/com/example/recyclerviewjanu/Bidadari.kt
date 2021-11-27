package com.example.recyclerviewjanu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Bidadari(
    val imgBidadari: Int,
    val nameBidadari: String,
    val descriptionBidadari: String
) : Parcelable
