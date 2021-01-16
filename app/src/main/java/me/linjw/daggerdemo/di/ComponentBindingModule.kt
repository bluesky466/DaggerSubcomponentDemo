package me.linjw.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import me.linjw.daggerdemo.MainActivity

@Module(subcomponents = [MainActivityComponent::class, SecondActivityComponent::class])
interface ComponentBindingModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    fun mainActivityComponentFactory(factory: MainActivityComponent.Factory): AndroidInjector.Factory<*>


    @Binds
    @IntoMap
    @ClassKey(SecondActivity::class)
    fun secondActivityComponentFactory(factory: SecondActivityComponent.Factory): AndroidInjector.Factory<*>
}
