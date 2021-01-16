package com.cvte.tv.daggerdemo.di

import com.cvte.tv.daggerdemo.DemoApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import me.linjw.daggerdemo.di.ComponentBindingModule

@Component(modules = [AndroidInjectionModule::class, AppModule::class, ComponentBindingModule::class])
interface AppComponent : AndroidInjector<DemoApplication>

