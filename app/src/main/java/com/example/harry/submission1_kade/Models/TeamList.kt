package com.example.harry.submission1_kade.Models

import com.google.gson.annotations.SerializedName


data class TeamList(

	@field:SerializedName("teams")
	val teams: List<TeamsItem?>? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("season")
	val season: Season? = null,

	@field:SerializedName("competition")
	val competition: Competition? = null,

	@field:SerializedName("filters")
	val filters: Filters? = null
)