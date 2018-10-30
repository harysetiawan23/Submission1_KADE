package com.example.harry.submission1_kade.Api

import com.example.harry.submission1_kade.Models.CompetitionsList
import com.example.harry.submission1_kade.Models.TeamList
import retrofit2.Call


import retrofit2.http.GET


interface EndPoint {
    @GET("competitions/2021/teams")
    fun getAllCompetitions() : Call<TeamList>
}