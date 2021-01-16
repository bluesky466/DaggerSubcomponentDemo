package me.linjw.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivity
import com.cvte.tv.daggerdemo.di.SecondActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [SecondActivityModule::class])
interface SecondActivityComponent : AndroidInjector<SecondActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<SecondActivity>
}
