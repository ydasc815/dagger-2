package com.aditya.dagger_kotlin.repositories

import androidx.lifecycle.LiveData

interface AuthRepository {

    fun testLiveData(par1: Int, par2: String, par3: Int): LiveData<String>

    fun testData(par1: Int, par2: Double): String

}