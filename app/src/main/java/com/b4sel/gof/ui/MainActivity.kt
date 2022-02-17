package com.b4sel.gof.ui

import android.os.Bundle
import androidx.navigation.Navigation
import com.b4sel.gof.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Navigation.findNavController(this, R.id.fragment_host)
    }
}