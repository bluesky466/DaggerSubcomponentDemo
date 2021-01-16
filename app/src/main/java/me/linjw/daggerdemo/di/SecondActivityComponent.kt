package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivity
import dagger.Subcomponent

@Subcomponent(modules = [SecondActivityModule::class])
interface SecondActivityComponent {
    fun inject(activity: SecondActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): SecondActivityComponent
    }
}
