package me.linjw.daggerdemo.di

import com.cvte.tv.daggerdemo.di.MainActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector
import me.linjw.daggerdemo.MainActivity

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainActivity>
}
