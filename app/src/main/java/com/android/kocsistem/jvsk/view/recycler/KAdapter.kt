package com.android.kocsistem.jvsk.view.recycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class KAdapter(private val list: List<*>) : RecyclerView.Adapter<KAdapter.Holder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, type: Int): Holder {
        val cell =
            LayoutInflater.from(viewGroup.context).inflate(android.R.layout.activity_list_item, viewGroup, false)
        return Holder(cell)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        if (holder is Holder) {
            TODO("bind your views")
        }
    }

    override fun getItemCount(): Int = list.size

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView)
}