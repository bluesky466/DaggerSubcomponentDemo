package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivity
import dagger.Component

@Component(modules = [SecondActivityModule::class], dependencies = [AppComponent::class])
interface SecondActivityComponent {
    fun inject(activity: SecondActivity)
}