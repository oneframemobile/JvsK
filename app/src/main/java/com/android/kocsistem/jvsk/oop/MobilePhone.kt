package com.android.kocsistem.jvsk.oop

open class MobilePhone(name: String, brand: String) : Phone(name, brand) {

    init {
        print("This phone has override constructor and abstract melody property")
    }

    var polyphonicMelody: String? = null
    var OSName: String? = null

    override fun call(): String {
        return "$polyphonicMelody ringing"
    }

}