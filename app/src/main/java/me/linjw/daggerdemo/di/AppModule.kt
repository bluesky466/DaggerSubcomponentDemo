package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.AppCommonData
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAppCommonData(): AppCommonData {
        return AppCommonData()
    }
}