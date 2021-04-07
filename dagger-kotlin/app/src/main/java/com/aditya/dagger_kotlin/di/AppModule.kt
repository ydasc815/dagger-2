package com.aditya.dagger_kotlin.di

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun injectTestString(): String = "Injecting Test String via App Module"

}