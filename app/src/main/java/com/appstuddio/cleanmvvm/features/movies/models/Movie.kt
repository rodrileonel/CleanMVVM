package com.appstuddio.cleanmvvm.features.movies.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie")
data class Movie(
    @PrimaryKey val id: Int,
    val poster: String
)