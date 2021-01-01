package com.solar.library.binding

import android.os.Bundle
import android.view.View
import com.solar.library.binding.databinding.FragmentSampleBinding
import com.solar.library.binding.fragment.BindingFragment

/**
 *  Created by Kenneth on 12/22/20
 */
class SampleFragment : BindingFragment<FragmentSampleBinding>(){
    override val layoutRes: Int = R.layout.fragment_sample

    override fun onViewCreated(bind: FragmentSampleBinding, savedInstanceState: Bundle?) {
        bind.sampleTv.text = "Hello World!"
    }
}