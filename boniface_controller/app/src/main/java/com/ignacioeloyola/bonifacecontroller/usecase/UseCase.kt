package com.ignacioeloyola.bonifacecontroller.usecase

import androidx.lifecycle.MutableLiveData
import com.ignacioeloyola.bonifacecontroller.data.Resource
import com.ignacioeloyola.bonifacecontroller.data.remote.dto.NewsItem
import com.ignacioeloyola.bonifacecontroller.data.remote.dto.NewsModel

/**
 * Created by ahmedeltaher on 3/22/17.
 */

interface UseCase {
    fun getNews()
    fun searchByTitle(keyWord: String): NewsItem?
    val newsLiveData: MutableLiveData<Resource<NewsModel>>
}
