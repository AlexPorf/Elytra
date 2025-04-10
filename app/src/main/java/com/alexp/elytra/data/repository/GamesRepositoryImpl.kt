package com.alexp.elytra.data.repository

import com.alexp.elytra.data.mapper.toEntities
import com.alexp.elytra.data.mapper.toEntity
import com.alexp.elytra.domain.entity.Game
import com.alexp.elytra.domain.repository.GamesRepository
import com.alexp.elytra.network.ApiService
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import javax.inject.Inject

class GamesRepositoryImpl @Inject constructor(
    private val apiService: ApiService
):GamesRepository{


    override suspend fun getTrendingGames(): List<Game> {
        return apiService.getTrendingGames().toEntity()
    }

    override suspend fun getRecommendedGames(): List<Game> {
        return apiService.getRecommendedGames().toEntity()

    }


}