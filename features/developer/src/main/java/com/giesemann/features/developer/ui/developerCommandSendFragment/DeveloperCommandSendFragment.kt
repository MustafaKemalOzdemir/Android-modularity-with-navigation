package com.giesemann.features.developer.ui.developerCommandSendFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.NumberPicker
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.giesemann.core.base.ui.BaseFragment
import com.giesemann.features.developer.R
import com.giesemann.features.developer.ui.developerCommandSendFragment.adapter.CommandLogAdapter
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
@ExperimentalUnsignedTypes
class DeveloperCommandSendFragment: BaseFragment(), DeveloperCommandSendView {

    @Inject
    internal lateinit var presenter: DeveloperCommandSendPresenter<DeveloperCommandSendView, DeveloperCommandSendInteractor, DeveloperCommandSendRouter>
    private lateinit var connectButton: Button
    private lateinit var sendButton: Button
    private lateinit var clearListButton: Button
    private lateinit var commandPicker: NumberPicker
    private lateinit var commandLog: RecyclerView
    private lateinit var backButton: ImageButton
    private lateinit var commandLogAdapter: CommandLogAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_developer_command_send, container, false)
    }

    override fun setUp(view: View) {
        presenter.onAttach(this,findNavController())
        initializeView(view)
        initializeInteractions()
    }

    private fun initializeView(view: View){
        connectButton = view.findViewById(R.id.developerCommandSendFragment_connect_button)
        sendButton = view.findViewById(R.id.developerCommandSendFragment_send_button)
        clearListButton = view.findViewById(R.id.developerCommandSendFragment_clearList_button)
        commandPicker = view.findViewById(R.id.developerCommandSendFragment_commandPicker_numberPicker)
        commandLog = view.findViewById(R.id.developerCommandSendFragment_commandLog_recyclerView)
        backButton = view.findViewById(R.id.developerCommandSendFragment_back_imageButton)

        commandLogAdapter = CommandLogAdapter()
        commandLog.adapter = commandLogAdapter
        commandLog.layoutManager = LinearLayoutManager(context)
    }

    private fun initializeInteractions(){
        connectButton.setOnClickListener { presenter.connectButtonPressed() }
        sendButton.setOnClickListener { presenter.sendButtonPressed() }
        clearListButton.setOnClickListener { presenter.clearButtonPressed() }
        backButton.setOnClickListener { presenter.backButtonPressed() }
        commandPicker.setOnValueChangedListener { picker, oldVal, newVal ->
        }
    }

    override fun addCommandLog(log: Boolean) {
        commandLogAdapter.addLog(log)
    }
    
}