package com.android.kocsistem.jvsk.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

class KFragment : Fragment() {

    companion object {

        fun newInstance(): KFragment {
            return KFragment().apply {
                arguments = Bundle().apply {
                    // TODO putInt
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}