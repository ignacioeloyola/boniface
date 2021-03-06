package com.ignacioeloyola.bonifacecontroller.ui.base.listeners

import com.ignacioeloyola.bonifacecontroller.data.error.Error

/**
 * Created by ahmedeltaher on 3/22/17.
 */

interface BaseCallback {
    fun onSuccess(data: Any)

    fun onFail(error : Error)
}
