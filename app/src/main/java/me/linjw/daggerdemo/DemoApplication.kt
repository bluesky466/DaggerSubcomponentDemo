package com.cvte.tv.daggerdemo

import android.app.Application
import com.cvte.tv.daggerdemo.di.DaggerAppComponent
import com.cvte.tv.daggerdemo.di.SecondActivityComponent
import me.linjw.daggerdemo.di.BaseComponent
import javax.inject.Inject


class DemoApplication : Application() {
    @Inject
    lateinit var componentMap: MutableMap<Class<*>, BaseComponent.Builder<*>>

    @Inject
    lateinit var secondActivityComponentBuilder: SecondActivityComponent.Builder

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .build()
            .inject(this)
    }

    fun <T : Any> inject(target: T) {
        (componentMap[target.javaClass]?.build() as BaseComponent<T>).inject(target)
    }
}