package com.alexp.elytra.network

import com.alexp.elytra.data.dto.GameDTO
import com.alexp.elytra.data.dto.ResponseDto
import com.alexp.elytra.domain.entity.Game
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {


    @GET("games")
    suspend fun getTrendingGames(
        @Query("dates") dates: String = "2023-01-01,2023-12-31",
        @Query("ordering") ordering: String = "-rating",
        @Query("page_size") pageSize: Int = 10
    ):ResponseDto



    @GET("games")
    suspend fun getRecommendedGames(
        @Query("ordering") ordering: String = "-released",
        @Query("metacritic") metacritic: String = "80,100",
        @Query("page_size") pageSize: Int = 10
    ): ResponseDto



}