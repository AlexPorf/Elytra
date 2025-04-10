package com.alexp.elytra.data.mapper

import com.alexp.elytra.data.dto.GameDTO
import com.alexp.elytra.data.dto.ResponseDto
import com.alexp.elytra.domain.entity.Game
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


fun GameDTO.toEntity(): Game {
    return Game(
        id = id,
        title = name,
        description = description,
        imageUrl = background_image,
        rating = rating.toFloat(),
        releaseDate = 2,
        genres = genres.map { it.name },
        platforms = platforms?.map { it.platform.name } ?: emptyList(),
        website = website,
        playtime = playtime,
        metacriticScore = metacritic,
        esrbRating = esrb_rating?.name,
        screenshots = short_screenshots?.map { it.image } ?: emptyList(),
        trailers = emptyList()
    )
}

private fun parseDate(dateString: String): Date? {
    return try {
        SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(dateString)
    } catch (e: Exception) {
        null
    }
}

fun List<GameDTO>.toEntities(): List<Game> = map { it.toEntity() }

fun ResponseDto.toEntity(): List<Game> {
    return results.toEntities()
}