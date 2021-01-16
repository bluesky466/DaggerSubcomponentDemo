package com.cvte.tv.daggerdemo

import android.app.Application
import com.cvte.tv.daggerdemo.di.*

class DemoApplication : Application() {
    private lateinit var appComponent: AppComponent

    lateinit var mainActivityComponent: MainActivityComponent
        private set

    lateinit var secondActivityComponent: SecondActivityComponent
        private set


    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()
        mainActivityComponent = appComponent.addMainActivityComponent()
        secondActivityComponent = appComponent.addSecondActivityComponent()
    }
}