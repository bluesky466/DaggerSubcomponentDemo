package com.cvte.tv.daggerdemo.di

import dagger.Subcomponent
import me.linjw.daggerdemo.MainActivity

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): MainActivityComponent
    }
}
