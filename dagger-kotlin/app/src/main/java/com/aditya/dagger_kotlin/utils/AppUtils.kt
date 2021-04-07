package com.aditya.dagger_kotlin.utils

import android.content.Context
import android.util.Log
import android.widget.Toast

fun log(msg: String) = Log.d("test-> ", msg)
fun toast(ctx: Context, msg: String) = Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()