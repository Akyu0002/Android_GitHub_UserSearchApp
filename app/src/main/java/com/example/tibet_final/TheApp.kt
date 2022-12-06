package com.example.tibet_final

//*****************************
//****** Tibet Akyurekli ******
//***** December 6th 2022 *****
//*****************************


import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class TheApp: Application() {

    //region onCreate Method
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
    //endregion

    //region Companion Obj
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
            private set
    }
    //endregion
}