package com.example.harry.submission1_kade.Models

import com.google.gson.annotations.SerializedName

data class Area(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)