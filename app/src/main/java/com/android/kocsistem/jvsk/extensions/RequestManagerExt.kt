package com.android.kocsistem.jvsk.extensions

import android.content.Context
import com.oneframe.android.networking.NetworkManager
import com.oneframe.android.networking.NetworkingFactory

@Volatile
private var INSTANCE: NetworkManager<*>? = null

fun Context.requestManager(): NetworkManager<*> {
    if (INSTANCE == null) {
        INSTANCE = NetworkingFactory.create()
    }

    return INSTANCE!!
}