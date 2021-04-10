package com.aditya.dagger_kotlin.di

import com.aditya.dagger_kotlin.ui.AuthActivity
import com.aditya.dagger_kotlin.ui.BaseActivity
import com.aditya.dagger_kotlin.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeBaseActivity(): BaseActivity

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeAuthActivity(): AuthActivity

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeMainActivity(): MainActivity

}