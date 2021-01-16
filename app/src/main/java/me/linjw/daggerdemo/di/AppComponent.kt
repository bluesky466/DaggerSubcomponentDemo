package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.DemoApplication
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: DemoApplication)
}
