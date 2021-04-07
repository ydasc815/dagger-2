package com.aditya.dagger_kotlin.ui

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.aditya.dagger_kotlin.R
import com.aditya.dagger_kotlin.databinding.ActivityAuthBinding
import com.aditya.dagger_kotlin.di.ViewModelProviderFactory
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding
    private lateinit var mViewModel: AuthViewModel

    @Inject
    lateinit var logo: Drawable

    @Inject
    lateinit var requestManager: RequestManager

    @Inject
    lateinit var viewModelFactory: ViewModelProviderFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
        setLogo()
    }

    private fun setLogo() {
        requestManager
            .load(logo)
            .into(binding.image)
    }
}