package com.ignacioeloyola.bonifacecontroller.data

import com.ignacioeloyola.bonifacecontroller.data.Resource
import com.ignacioeloyola.bonifacecontroller.data.remote.dto.NewsModel

/**
 * Created by ahmedeltaher on 3/23/17.
 */

interface DataSource {
    suspend fun requestNews(): Resource<NewsModel>
}
