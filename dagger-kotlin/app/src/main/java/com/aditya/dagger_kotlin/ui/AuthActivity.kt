package com.aditya.dagger_kotlin.ui

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.aditya.dagger_kotlin.R
import com.aditya.dagger_kotlin.databinding.ActivityAuthBinding
import com.aditya.dagger_kotlin.utils.log
import com.aditya.dagger_kotlin.utils.toast
import com.bumptech.glide.RequestManager
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var logo: Drawable

    @Inject
    lateinit var requestManager: RequestManager

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var binding: ActivityAuthBinding
    private lateinit var mViewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
        getViewModel()
        binding.btnLogin.setOnClickListener {
            mViewModel.data.value = "This is the new value"
            log(mViewModel.data.value.toString())
        }
        setLogo()
    }

    private fun getViewModel() {
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(AuthViewModel::class.java)
        binding.viewModel = mViewModel
        binding.lifecycleOwner = this
    }

    private fun setLogo() {
        requestManager
            .load(logo)
            .into(binding.image)
    }
}