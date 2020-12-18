package com.solar.binding.library.activity

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 *  Created by Kenneth on 12/18/20
 */
abstract class BindingActivity : AppCompatActivity() {

    protected inline fun <reified T : ViewDataBinding> binding(@LayoutRes resId: Int): Lazy<T> =
        lazy { DataBindingUtil.setContentView<T>(this, resId) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}