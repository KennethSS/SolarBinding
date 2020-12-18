package com.solar.binding.library.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager

abstract class BindingDialogFragment<B: ViewDataBinding> : AppCompatDialogFragment() {

    protected var bind: B? = null

    protected abstract val layoutRes: Int

    fun showDialog(fragmentManager: FragmentManager?, tag: String) {
        fragmentManager?.let {
            show(it, tag)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = DataBindingUtil.inflate(inflater, layoutRes, container, false)

        return bind?.root
    }
}