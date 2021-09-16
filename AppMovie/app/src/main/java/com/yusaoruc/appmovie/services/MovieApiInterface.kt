package com.yusaoruc.appmovie.services

import com.yusaoruc.appmovie.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/discover/movie?api_key=3bb3e67969473d0cb4a48a0dd61af747")
    fun getMovieList(): Call<MovieResponse>
}