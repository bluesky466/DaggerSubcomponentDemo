package com.cvte.tv.daggerdemo.di

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun addMainActivityComponent(): MainActivityComponent
    fun addSecondActivityComponent(): SecondActivityComponent
}
