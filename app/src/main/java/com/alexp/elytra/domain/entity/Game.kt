package com.alexp.elytra.domain.entity

import kotlinx.serialization.Serializable
import java.util.Date


@Serializable
data class Game(
    val id: Int,
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val rating: Float,
    val releaseDate: Long,
    val genres: List<String>,
    val platforms: List<String>,
    val website: String?,
    val playtime: Int?,
    val metacriticScore: Int?,
    val esrbRating: String?,
    val screenshots: List<String>,
    val trailers: List<String>
)