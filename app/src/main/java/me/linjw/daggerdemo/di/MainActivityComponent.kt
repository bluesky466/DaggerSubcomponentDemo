package com.cvte.tv.daggerdemo.di

import dagger.Component
import me.linjw.daggerdemo.MainActivity

@Component(modules = [MainActivityModule::class], dependencies = [AppComponent::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}