package com.yusaoruc.appmovie

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import com.yusaoruc.appmovie.models.Movie
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_movie_details.*

class MovieDeatilsActivity : AppCompatActivity() {
    private val IMAGE_BASE = "https://image.tmdb.org/t/p/w185/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        val nGet = intent.getStringExtra("title")
        val overV = intent.getStringExtra("overview")
        val poster = intent.getStringExtra("poster")
        textView7.text=nGet
        Picasso.get().load(IMAGE_BASE+poster).into(imageView)
        textView8.text=overV

    }
}