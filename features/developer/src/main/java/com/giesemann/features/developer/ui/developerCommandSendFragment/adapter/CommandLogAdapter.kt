package com.giesemann.features.developer.ui.developerCommandSendFragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.giesemann.features.developer.R
import java.text.SimpleDateFormat
import java.util.*

/**
Created by Mustafa Kemal ÖZDEMİR on 16.02.2021
 */
class CommandLogAdapter: RecyclerView.Adapter<CommandLogAdapter.CommandLogViewHolder>() {
    private val data = mutableListOf<Boolean>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommandLogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_command_log_developer_command, parent, false)
        return CommandLogViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommandLogViewHolder, position: Int) {
        if(data[position]){
            //success configuration
            holder.title.apply {
                text = resources.getString(R.string.developerCommandSendFragment_commandLog_listItem_success)
                setTextColor(ContextCompat.getColor(context, R.color.success_green))
            }
        }else{
            //fail configuration
            holder.title.apply {
                text = resources.getString(R.string.developerCommandSendFragment_commandLog_listItem_fail)
                setTextColor(ContextCompat.getColor(context, R.color.fail_red))
            }
        }
        val dateTime = Calendar.getInstance().time
        holder.timeStamp.text = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(dateTime)
    }

    override fun getItemCount(): Int {
        return data.count()
    }

    fun updateData(mutableList: MutableList<Boolean>){
        data.clear()
        mutableList.forEach{
            data.add(it)
        }
        notifyDataSetChanged()
    }

    fun addLog(log: Boolean){
        data.add(log)
        notifyDataSetChanged()
    }

    inner class CommandLogViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title = view.findViewById<TextView>(R.id.listItem_commandLog_developerCommand_title_text)
        val timeStamp = view.findViewById<TextView>(R.id.listItem_commandLog_developerCommand_title_timeStamp)
    }

}