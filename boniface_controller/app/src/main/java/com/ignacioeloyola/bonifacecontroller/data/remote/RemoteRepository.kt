package com.ignacioeloyola.bonifacecontroller.data.remote

import com.ignacioeloyola.bonifacecontroller.App
import com.ignacioeloyola.bonifacecontroller.data.error.Error.Companion.NETWORK_ERROR
import com.ignacioeloyola.bonifacecontroller.data.error.Error.Companion.NO_INTERNET_CONNECTION
import com.ignacioeloyola.bonifacecontroller.data.remote.dto.NewsModel
import com.ignacioeloyola.bonifacecontroller.data.remote.service.NewsService
import com.ignacioeloyola.bonifacecontroller.utils.Constants
import com.ignacioeloyola.bonifacecontroller.utils.Network.Utils.isConnected
import com.ignacioeloyola.bonifacecontroller.data.Resource
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject


/**
 * Created by AhmedEltaher on 5/12/2016
 */

class RemoteRepository @Inject
constructor(private val serviceGenerator: ServiceGenerator) : RemoteSource {

    override suspend fun requestNews(): Resource<NewsModel> {
        val newsService = serviceGenerator.createService(NewsService::class.java, Constants.BASE_URL)
        return when (val response = processCall(newsService::fetchNews)) {
            is NewsModel -> {
                Resource.Success(data = response)
            }
            else -> {
                Resource.DataError(errorCode = response as Int)
            }
        }
    }

    private suspend fun processCall(responseCall: suspend () -> Response<*>): Any? {
        if (!isConnected(App.context)) {
            return NO_INTERNET_CONNECTION
        }
        return try {
            val response = responseCall.invoke()
            val responseCode = response.code()
            if (response.isSuccessful) {
                response.body()
            } else {
                responseCode
            }
        } catch (e: IOException) {
            NETWORK_ERROR
        }
    }
}
