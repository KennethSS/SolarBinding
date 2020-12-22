package com.solar.library.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solar.library.binding.activity.BindingActivity
import com.solar.library.binding.databinding.ActivityMainBinding

class MainActivity : BindingActivity() {

    private val binding by binding<ActivityMainBinding>(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(binding) {
            centerTv.text = "Hello World!"
        }
    }
}