package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivity
import dagger.Subcomponent
import me.linjw.daggerdemo.di.BaseComponent

@Subcomponent(modules = [SecondActivityModule::class])
interface SecondActivityComponent : BaseComponent<SecondActivity> {
    @Subcomponent.Builder
    interface Builder : BaseComponent.Builder<SecondActivity>
}