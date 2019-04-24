package com.android.kocsistem.jvsk.view.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

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
