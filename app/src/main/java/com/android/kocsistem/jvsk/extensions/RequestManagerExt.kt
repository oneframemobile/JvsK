package com.android.kocsistem.jvsk.extensions

import android.content.Context

private var INSTANCE: String? = null

fun Context.requestMamanager(): String {
    if (INSTANCE.isNullOrEmpty()) {
        INSTANCE = "Selam"
    }

    return INSTANCE!!
}