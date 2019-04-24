package com.android.kocsistem.jvsk.view.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.kocsistem.jvsk.oop.MobilePhone
import com.android.kocsistem.jvsk.oop.PDA
import com.android.kocsistem.jvsk.oop.Phone

class KActivity : AppCompatActivity() {

    companion object {

        private val ID = "id"

        fun start(context: Context, id: Long? = null) {
            val starter = Intent(context, KActivity::class.java).apply {
                putExtra(ID, id)
            }
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val phones = ArrayList<Phone>()
        val moto = MobilePhone("MT-150", "Motorola").apply {
            polyphonicMelody = "dombra dombra"
        }
        val android = PDA("S9100", "Samsung").apply {
            mp3 = "daglardalgar.mp3"
        }

        phones.add(moto)
        phones.add(android)
        phones.forEach { it.call() }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
