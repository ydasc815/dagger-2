package com.aditya.dagger_kotlin.di

import android.app.Application
import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.aditya.dagger_kotlin.R
import com.aditya.dagger_kotlin.ui.TestRepository
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideRequestOptions(): RequestOptions = RequestOptions()
        .placeholder(R.drawable.image)
        .error(R.drawable.ic_launcher_background)

    @Singleton
    @Provides
    fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager {
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }

    @Singleton
    @Provides
    fun provideAppDrawable(application: Application): Drawable {
        return ContextCompat.getDrawable(application, R.drawable.image)!!
    }

    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application.applicationContext

    @Singleton
    @Provides
    fun provideTestRepository(): TestRepository {
        return TestRepository()
    }
}