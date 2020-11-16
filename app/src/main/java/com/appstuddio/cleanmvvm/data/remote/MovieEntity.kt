package com.appstuddio.cleanmvvm.data.remote

import com.appstuddio.cleanmvvm.features.movies.models.Movie
import com.google.gson.annotations.SerializedName

class MovieEntity {
    data class Response(
        @SerializedName("id") val id: Int,
        @SerializedName("poster") val poster: String
    ) {
        fun toMovie() = Movie(id, poster)
    }
}