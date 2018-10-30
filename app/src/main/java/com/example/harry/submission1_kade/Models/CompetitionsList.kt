package com.example.harry.submission1_kade.Models

import com.google.gson.annotations.SerializedName


data class CompetitionsList(

		@field:SerializedName("count")
	val count: Int? = null,

		@field:SerializedName("competitions")
	val competitions: List<CompetitionsItem?>? = null,

		@field:SerializedName("filters")
	val filters: Filters? = null
)