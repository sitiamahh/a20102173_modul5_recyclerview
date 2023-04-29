package com.example.a20102173_modul5_recyclerview
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Inis_Variable(
    val fotomhs: Int = 0,
    val Namamhs: String,
    val Nimmhs: String,
    val Telp: String
): Parcelable
