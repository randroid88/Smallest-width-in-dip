package io.winf.smallestwidthindip

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.winf.data.ViewModel
import io.winf.smallestwidthindip.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main)

        binding.viewmodel = ViewModel(resources.configuration.smallestScreenWidthDp.toString())
    }
}
