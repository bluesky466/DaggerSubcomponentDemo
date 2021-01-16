package com.cvte.tv.daggerdemo.di

import dagger.Subcomponent
import me.linjw.daggerdemo.MainActivity
import me.linjw.daggerdemo.di.BaseComponent

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : BaseComponent<MainActivity> {
    @Subcomponent.Builder
    interface Builder : BaseComponent.Builder<MainActivity>
}