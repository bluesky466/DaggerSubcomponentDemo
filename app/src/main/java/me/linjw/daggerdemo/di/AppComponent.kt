package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.DemoApplication
import dagger.Component
import me.linjw.daggerdemo.di.ComponentBindingModule

@Component(modules = [AppModule::class, ComponentBindingModule::class])
interface AppComponent {
    fun inject(app: DemoApplication)
}
