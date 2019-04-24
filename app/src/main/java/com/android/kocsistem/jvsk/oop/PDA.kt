package com.android.kocsistem.jvsk.oop

class PDA(name: String, brand: String) : MobilePhone(name, brand) {

    var mp3: String? = null

    override fun call(): String {
        return "$mp3.mp3 is ringing"
    }

}