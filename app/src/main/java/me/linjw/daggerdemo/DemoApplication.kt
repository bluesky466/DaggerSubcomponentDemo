package com.cvte.tv.daggerdemo

import android.app.Application
import com.cvte.tv.daggerdemo.di.*
import javax.inject.Inject

class DemoApplication : Application() {
    @Inject
    lateinit var mainActivityComponentBuilder: MainActivityComponent.Builder

    @Inject
    lateinit var secondActivityComponentBuilder: SecondActivityComponent.Builder

    lateinit var mainActivityComponent: MainActivityComponent

    lateinit var secondActivityComponent: SecondActivityComponent


    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .build()
            .inject(this)
        mainActivityComponent = mainActivityComponentBuilder.build()
        secondActivityComponent = secondActivityComponentBuilder.build()
    }
}