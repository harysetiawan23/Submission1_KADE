package com.example.harry.submission1_kade.Models


import com.google.gson.annotations.SerializedName


data class CompetitionDetail(

	@field:SerializedName("area")
	val area: Area? = null,

	@field:SerializedName("lastUpdated")
	val lastUpdated: String? = null,

	@field:SerializedName("seasons")
	val seasons: List<SeasonsItem?>? = null,

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("emblemUrl")
	val emblemUrl: Any? = null,

	@field:SerializedName("currentSeason")
	val currentSeason: CurrentSeason? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("plan")
	val plan: String? = null
)