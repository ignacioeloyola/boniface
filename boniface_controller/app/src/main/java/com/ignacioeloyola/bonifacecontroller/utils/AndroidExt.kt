package com.ignacioeloyola.bonifacecontroller.utils

fun <T> androidLazy(initializer: () -> T): Lazy<T> = lazy(LazyThreadSafetyMode.NONE, initializer)
