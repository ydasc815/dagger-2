package com.aditya.dagger_kotlin.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.aditya.dagger_kotlin.R
import com.aditya.dagger_kotlin.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        getViewModel()
    }

    private fun getViewModel() {
        mViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        binding.lifecycleOwner = this
    }
}