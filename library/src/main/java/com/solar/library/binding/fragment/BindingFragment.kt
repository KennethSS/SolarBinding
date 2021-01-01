package com.solar.library.binding.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 *  Created by Kenneth on 12/18/20
 */
abstract class BindingFragment<B: ViewDataBinding> : Fragment() {

    protected var bind: B? = null

    protected abstract val layoutRes: Int

    protected abstract fun onViewCreated(bind: B, savedInstanceState: Bundle?)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = DataBindingUtil.inflate<B>(inflater, layoutRes, container, false)?.also {
            it.lifecycleOwner = viewLifecycleOwner
        }

        return bind?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind?.let { onViewCreated(it, savedInstanceState) }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bind = null
    }
}