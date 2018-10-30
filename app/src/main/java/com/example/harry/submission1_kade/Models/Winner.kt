package com.example.harry.submission1_kade.Models


import com.google.gson.annotations.SerializedName

data class Winner(

	@field:SerializedName("crestUrl")
	val crestUrl: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("tla")
	val tla: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("shortName")
	val shortName: String? = null
)