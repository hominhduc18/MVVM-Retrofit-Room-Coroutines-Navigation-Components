package com.example.newapp.ui

import androidx.lifecycle.ViewModel
import com.example.newapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {
}