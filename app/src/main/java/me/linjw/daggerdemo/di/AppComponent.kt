package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.AppCommonData
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun provideAppCommonData(): AppCommonData
}
