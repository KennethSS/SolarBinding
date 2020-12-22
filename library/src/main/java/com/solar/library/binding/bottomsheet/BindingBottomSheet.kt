package com.solar.library.binding.bottomsheet

import android.content.Context
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class BindingBottomSheet {
    companion object {
        fun <V: ViewDataBinding>show(context: Context, resId: Int, onShow:(V) -> Unit) {
            BottomSheetDialog(context).apply {
                val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                val bind = DataBindingUtil.inflate<V>(inflater, resId, null, false)
                setContentView(bind.root)
                setOnShowListener { onShow(bind) }
                show()
            }
        }
    }
}