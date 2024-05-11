package com.example.crudapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter:RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    var userList = mutableListOf<User>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recucler_row_list, parent, false)
        return MyViewHolder(inflater)
    }
    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.bind(userList[position])
    }

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val textViewName: TextView = view.findViewById(R.id.textViewName)
        val textViewEmail: TextView= view.findViewById(R.id.textViewEmail)
        val textViewStates: TextView= view.findViewById(R.id.textViewStats)

        fun bind(data:User){
            textViewName.text = data.name
            textViewEmail.text = data.email
            textViewStates.text = data.status
        }
    }

}