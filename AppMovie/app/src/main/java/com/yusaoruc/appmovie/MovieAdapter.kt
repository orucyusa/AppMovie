package com.yusaoruc.appmovie

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yusaoruc.appmovie.models.Movie
import kotlinx.android.synthetic.main.moive_item.view.*

class MovieAdapter(
    private val movies : List<Movie>,
     val context: Context
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View,val context: Context) : RecyclerView.ViewHolder(view) {
        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w185/"
        fun bindMovie(movie: Movie) {

            itemView.movie_title.text = movie.title
            itemView.movie_release_date.text = movie.release
            itemView.vote_average.text="Vote Average: "+movie.vote
            itemView.original_language.text="Language: "+movie.lang
            Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.movie_poster)
            itemView.setOnClickListener {
                val intent = Intent(context,MovieDeatilsActivity::class.java)
                intent.putExtra("overview",movie.overview)
                intent.putExtra("title",movie.title)
                intent.putExtra("poster",movie.poster)
                context.startActivity(intent)


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.moive_item, parent, false),context
        )
    }
    override fun getItemCount(): Int = movies.size
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies.get(position))
    }
}
