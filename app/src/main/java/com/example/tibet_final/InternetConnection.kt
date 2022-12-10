package com.example.tibet_final

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

// Created by Tibet Akyurekli October 18 2022

class InternetConnection (private val context: Context){

    //region isConnected variable and Getter
    val isConnected: Boolean
        get() = checkNetworkConnectivity()
    //endregion

    //region checkNetworkConnectivity Method
    private fun checkNetworkConnectivity(): Boolean {

        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val network = connectivityManager.activeNetwork
        val connection = connectivityManager.getNetworkCapabilities(network)

        return ( connection?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ?: false ||
                connection?.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ?: false)
    }
    //endregion
}

