package com.ignacioeloyola.bonifacecontroller.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.ignacioeloyola.bonifacecontroller.data.remote.dto.NewsItem

data class NewsModel(
    var copyright: String = "",
    @SerializedName("last_updated")
        var lastUpdated: String = "",
    @SerializedName("num_results")
        var numResults: Int = 0,
    @SerializedName("results")
        var newsItems: List<NewsItem> = listOf(),
    var section: String = "",
    var status: String = ""
)