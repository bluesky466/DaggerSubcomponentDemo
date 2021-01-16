package me.linjw.daggerdemo.di

interface BaseComponent<T> {
    fun inject(target: T)

    interface Builder<T> {
        fun build(): BaseComponent<T>
    }
}