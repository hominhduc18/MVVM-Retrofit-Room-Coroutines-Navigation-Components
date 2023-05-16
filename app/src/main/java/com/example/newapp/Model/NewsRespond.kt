package com.example.newapp.Model

import com.example.newapp.Model.Article

data class NewsRespond(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
