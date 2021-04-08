package com.aditya.dagger_kotlin.di

import com.aditya.dagger_kotlin.ui.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeAuthActivity(): AuthActivity
}