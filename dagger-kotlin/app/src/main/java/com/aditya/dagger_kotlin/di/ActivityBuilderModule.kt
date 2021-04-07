package com.aditya.dagger_kotlin.di

import com.aditya.dagger_kotlin.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity
}