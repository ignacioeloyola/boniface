package com.ignacioeloyola.bonifacecontroller.data.remote

import com.ignacioeloyola.bonifacecontroller.data.Resource
import com.ignacioeloyola.bonifacecontroller.data.remote.dto.NewsModel

/**
 * Created by ahmedEltaher on 3/23/17.
 */

internal interface RemoteSource {
    suspend fun requestNews(): Resource<NewsModel>
}
