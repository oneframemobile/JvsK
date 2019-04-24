package com.android.kocsistem.jvsk.singleton

class KSingleton private constructor() {

    companion object {

        @Volatile
        private var INSTANCE: KSingleton? = null

        fun getInstance(): KSingleton {
            return INSTANCE ?: synchronized(this) {
                KSingleton().also {
                    INSTANCE = it
                }
            }
        }
    }
}