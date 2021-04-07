package com.aditya.dagger_kotlin

import android.os.Bundle
import com.aditya.dagger_kotlin.utils.log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var injectorString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        log(injectorString)
    }
}