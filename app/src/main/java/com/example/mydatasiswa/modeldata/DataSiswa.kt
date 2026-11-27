package com.example.mydatasiswa.modeldata

import android.telecom.Call
import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa (
    val id: Int,
    val nama: String,
    val alamat: String,
    val telpon: String,
    )

data class UIStateSiswa(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = "",
)


