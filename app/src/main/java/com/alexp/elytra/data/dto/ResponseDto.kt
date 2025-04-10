package com.alexp.elytra.data.dto

import com.google.gson.annotations.SerializedName

data class ResponseDto(
    @SerializedName("id")val count: Int,
    @SerializedName("id")val next: String?,
    @SerializedName("id")val previous: String?,
    @SerializedName("id")val results: List<GameDTO>
)