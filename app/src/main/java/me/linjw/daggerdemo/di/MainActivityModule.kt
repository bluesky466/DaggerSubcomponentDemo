package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.MainActivityData
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun providerMainActivityData(): MainActivityData {
        return MainActivityData()
    }
}