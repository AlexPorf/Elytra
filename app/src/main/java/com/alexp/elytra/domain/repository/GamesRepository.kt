package com.alexp.elytra.domain.repository

import com.alexp.elytra.domain.entity.Game
import kotlinx.coroutines.flow.Flow

interface GamesRepository {

    suspend fun getTrendingGames(): List<Game>

    suspend fun getRecommendedGames(): List<Game>

}