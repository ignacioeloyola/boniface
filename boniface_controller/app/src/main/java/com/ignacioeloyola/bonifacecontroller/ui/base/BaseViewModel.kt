package com.ignacioeloyola.bonifacecontroller.ui.base

import androidx.lifecycle.ViewModel
import com.ignacioeloyola.bonifacecontroller.usecase.errors.ErrorManager


/**
 * Created by AhmedEltaher on 5/12/2016
 */


abstract class BaseViewModel : ViewModel() {
    /**Inject Singlton ErrorManager
     * Use this errorManager to get the Errors
     */
    abstract val errorManager: ErrorManager

}
