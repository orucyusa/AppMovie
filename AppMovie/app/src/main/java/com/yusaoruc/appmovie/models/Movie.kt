package com.yusaoruc.appmovie.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("release_date")
    val release : String?,

    @SerializedName("vote_average")
    val vote : String?,

    @SerializedName("original_language")
    val lang : String?,

    @SerializedName("overview")
    val overview: String?,

) : Parcelable {
    constructor() : this("", "", "", "","","","")
}