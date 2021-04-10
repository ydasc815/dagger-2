package com.aditya.dagger_kotlin.ui

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aditya.dagger_kotlin.repositories.AuthRepository
import com.aditya.dagger_kotlin.repositories.TestRepository
import com.aditya.dagger_kotlin.utils.log
import javax.inject.Inject

class AuthViewModel @Inject constructor(
    context: Context, testRepository: TestRepository, authRepository: AuthRepository
): ViewModel() {

    var data: MutableLiveData<String> = MutableLiveData("default value")

    init {
        log("context injected -> $context")
        log(testRepository.testMethod())
        log(authRepository.testData(567, 768.89))
    }
}