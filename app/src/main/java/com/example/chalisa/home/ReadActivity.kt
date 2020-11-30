package com.example.chalisa.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chalisa.R
import com.example.chalisa.databinding.ActivityReadBinding

class ReadActivity : AppCompatActivity() {
    lateinit var activityReadBinding: ActivityReadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_read)
        activityReadBinding = DataBindingUtil.setContentView(this, R.layout.activity_read)
        activityReadBinding.apply {
            executePendingBindings()
            lifecycleOwner = this@ReadActivity
        }
        loadDate(intent.getIntExtra("pos", 0))
    }

    private fun loadDate(i: Int) {
        when (i) {
            1 -> {
                activityReadBinding.tv.text = getString(R.string.chalisa)
            }
            2 -> {
                activityReadBinding.tv.text = getString(R.string.arti_full)
            }
            3 -> {
                activityReadBinding.tv.text = getString(R.string.bajrang_baan_path)
            }
            4 -> {
                activityReadBinding.tv.text = getString(R.string.names)
            }
            5 -> {
                activityReadBinding.tv.text = getString(R.string.kirplu_path)
            }
            6 -> {
                activityReadBinding.tv.text = getString(R.string.mantar)
            }
            else -> {
                activityReadBinding.tv.text = getString(R.string.bajrang_baan_path)
            }
        }
    }

}