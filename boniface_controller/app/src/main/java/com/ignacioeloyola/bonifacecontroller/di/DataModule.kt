
package com.ignacioeloyola.bonifacecontroller.di

import com.ignacioeloyola.bonifacecontroller.data.DataRepository
import com.ignacioeloyola.bonifacecontroller.data.DataSource
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

// Tells Dagger this is a Dagger module
@Module
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun provideDataRepository(dataRepository: DataRepository): DataSource
}
