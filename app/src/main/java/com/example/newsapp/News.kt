package com.example.newsapp

import java.io.Serializable

data class News(
    val title: String,
    val author: String,
    val content: String
) : Serializable

