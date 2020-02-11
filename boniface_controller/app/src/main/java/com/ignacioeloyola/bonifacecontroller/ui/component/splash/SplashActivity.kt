package com.ignacioeloyola.bonifacecontroller.ui.component.splash

import android.os.Bundle
import android.os.Handler
import com.ignacioeloyola.bonifacecontroller.R
import com.ignacioeloyola.bonifacecontroller.ui.ViewModelFactory
import com.ignacioeloyola.bonifacecontroller.ui.base.BaseActivity
import com.ignacioeloyola.bonifacecontroller.ui.component.main.MainActivity
import com.ignacioeloyola.bonifacecontroller.utils.Constants
import org.jetbrains.anko.startActivity
import javax.inject.Inject

/**
 * Created by AhmedEltaher on 5/12/2016
 */

class SplashActivity : BaseActivity(){
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override val layoutId: Int
        get() = R.layout.splash_layout

    override fun initializeViewModel() {
        splashViewModel = viewModelFactory.create(splashViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToMainScreen()
    }

    override fun observeViewModel() {

    }

    private fun navigateToMainScreen() {
        Handler().postDelayed({
            startActivity<MainActivity>()
            finish()
        }, Constants.SPLASH_DELAY.toLong())
    }
}