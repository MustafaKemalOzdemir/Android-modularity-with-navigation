package com.giesemann.lynk

import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.giesemann.core.base.ui.BaseActivity
import com.giesemann.navigation.LynkNavigationManager
import javax.inject.Inject


class MainActivity : BaseActivity() {
    @Inject
    lateinit var appNavigationManager: LynkNavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("main_Activitiy", "aaa $appNavigationManager")
        //startActivity(Intent(this, DeveloperActivity::class.java))
    }

    override fun onStart() {
        super.onStart()
        appNavigationManager.initializeAppNavManager(Navigation.findNavController(this, R.id.nav_host_fragment))
    }
}