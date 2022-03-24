package com.b4sel.gof.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.b4sel.gof.R
import com.b4sel.gof.ActivityHolder
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityHolder.activity = WeakReference(this)
    }
}