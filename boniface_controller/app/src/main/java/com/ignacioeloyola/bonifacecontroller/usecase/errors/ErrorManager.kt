package com.ignacioeloyola.bonifacecontroller.usecase.errors

import com.ignacioeloyola.bonifacecontroller.data.error.Error
import com.ignacioeloyola.bonifacecontroller.data.error.mapper.ErrorMapper
import javax.inject.Inject

/**
 * Created by AhmedEltaher on 5/12/2016
 */

class ErrorManager @Inject constructor(private val errorMapper: ErrorMapper) : ErrorFactory {
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode, description = errorMapper.errorsMap.getValue(errorCode))
    }

}