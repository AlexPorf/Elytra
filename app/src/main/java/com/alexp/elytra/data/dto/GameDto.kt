package com.alexp.elytra.data.dto

import com.google.gson.annotations.SerializedName

data class GameDTO(
    @SerializedName("id")val id: Int,
    @SerializedName("name")val name: String,
    @SerializedName("description")val description: String?,
    @SerializedName("background_image") val background_image: String?,
    @SerializedName("rating")val rating: Double,
    @SerializedName("released")val released: String?,
    @SerializedName("genres")val genres: List<GenreDTO>,
    @SerializedName("platforms")val platforms: List<PlatformDTO>?,
    @SerializedName("website")val website: String?,
    @SerializedName("playtime")val playtime: Int?,
    @SerializedName("metacritic")val metacritic: Int?,
    @SerializedName("esrb_rating")  val esrb_rating: EsrbRatingDTO?,
    @SerializedName("short_screenshots") val short_screenshots: List<ScreenshotDTO>?
)


data class GenreDTO(val name: String)
data class PlatformDTO(val platform: PlatformInfoDTO)
data class PlatformInfoDTO(val name: String)
data class EsrbRatingDTO(val name: String)
data class ScreenshotDTO(val image: String)