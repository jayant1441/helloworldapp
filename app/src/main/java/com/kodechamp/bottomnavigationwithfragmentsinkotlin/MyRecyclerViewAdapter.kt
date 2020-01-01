package com.kodechamp.bottomnavigationwithfragmentsinkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recyclerview_ticket.view.*

class MyRecyclerViewAdapter(var context: Context, var ListOfRecyclerView : ArrayList<RecyclerViewDataClass>):RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {


    inner class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
       val tv_recyclerview_ticket = view.tv_recylerview_ticket
       val iv_recyclerview_ticket = view.iv_recylerview_ticket
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_ticket, parent, false))
    }


    override fun getItemCount(): Int {
        return ListOfRecyclerView.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = ListOfRecyclerView[position]
        holder.iv_recyclerview_ticket.setImageResource(item.RecyclerviewIcon!!)
        holder.tv_recyclerview_ticket.text = item.RectclerviewText

    }


}