package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivityData
import dagger.Module
import dagger.Provides

@Module
class SecondActivityModule {
    @Provides
    fun providerSecondActivityData(): SecondActivityData {
        return SecondActivityData()
    }
}