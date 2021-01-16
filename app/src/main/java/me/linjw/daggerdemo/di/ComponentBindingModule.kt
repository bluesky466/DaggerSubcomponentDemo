package me.linjw.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivity
import com.cvte.tv.daggerdemo.di.MainActivityModule
import com.cvte.tv.daggerdemo.di.SecondActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.linjw.daggerdemo.MainActivity

@Module
abstract class ComponentBindingModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributesMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [SecondActivityModule::class])
    abstract fun contributesSecondActivity(): SecondActivity
}
