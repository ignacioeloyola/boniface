package com.ignacioeloyola.bonifacecontroller.ui.component.splash

import com.ignacioeloyola.bonifacecontroller.usecase.errors.ErrorManager
import com.ignacioeloyola.bonifacecontroller.data.error.mapper.ErrorMapper
import com.ignacioeloyola.bonifacecontroller.ui.base.BaseViewModel
import javax.inject.Inject

/**
 * Created by AhmedEltaher on 5/12/2016
 */

class SplashViewModel @Inject
constructor() : BaseViewModel(){
    override val errorManager: ErrorManager
        get() = ErrorManager(ErrorMapper())
}
