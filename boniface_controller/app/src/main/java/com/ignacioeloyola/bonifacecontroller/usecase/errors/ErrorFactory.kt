package com.ignacioeloyola.bonifacecontroller.usecase.errors

import com.ignacioeloyola.bonifacecontroller.data.error.Error

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}