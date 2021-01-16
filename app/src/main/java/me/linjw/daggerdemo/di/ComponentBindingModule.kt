package me.linjw.daggerdemo.di

import com.cvte.tv.daggerdemo.SecondActivity
import com.cvte.tv.daggerdemo.di.MainActivityComponent
import com.cvte.tv.daggerdemo.di.SecondActivityComponent
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import me.linjw.daggerdemo.MainActivity

@Module(subcomponents = [MainActivityComponent::class, SecondActivityComponent::class])
interface ComponentBindingModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    fun mainActivityComponentBuilder(builder: MainActivityComponent.Builder): BaseComponent.Builder<*>


    @Binds
    @IntoMap
    @ClassKey(SecondActivity::class)
    fun secondActivityComponentBuilder(builder: SecondActivityComponent.Builder): BaseComponent.Builder<*>
}
