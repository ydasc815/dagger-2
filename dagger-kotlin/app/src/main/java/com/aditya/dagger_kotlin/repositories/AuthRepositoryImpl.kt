package com.aditya.dagger_kotlin.repositories

import androidx.lifecycle.LiveData

class AuthRepositoryImpl : AuthRepository {
    override fun testLiveData(par1: Int, par2: String, par3: Int): LiveData<String> {
        TODO("Not yet implemented")
    }

    override fun testData(par1: Int, par2: Double): String {
        return (par1 + par2).toString()
    }
}