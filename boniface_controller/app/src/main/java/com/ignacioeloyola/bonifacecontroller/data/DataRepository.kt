package com.ignacioeloyola.bonifacecontroller.data

import com.ignacioeloyola.bonifacecontroller.data.DataSource
import com.ignacioeloyola.bonifacecontroller.data.Resource
import com.ignacioeloyola.bonifacecontroller.data.local.LocalRepository
import com.ignacioeloyola.bonifacecontroller.data.remote.RemoteRepository
import com.ignacioeloyola.bonifacecontroller.data.remote.dto.NewsModel
import javax.inject.Inject


/**
 * Created by AhmedEltaher on 5/12/2016
 */

class DataRepository @Inject
constructor(private val remoteRepository: RemoteRepository, private val localRepository: LocalRepository) :
    DataSource {

    override suspend fun requestNews(): Resource<NewsModel> {
        return remoteRepository.requestNews()
    }
}
