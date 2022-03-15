package com.b4sel.gof

import androidx.appcompat.app.AppCompatActivity
import java.lang.ref.WeakReference

object ActivityHolder {
    var activity: WeakReference<AppCompatActivity>? = null
}