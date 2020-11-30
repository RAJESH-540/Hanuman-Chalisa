package com.example.chalisa.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.chalisa.R
import com.example.chalisa.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var activityHomeBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding=DataBindingUtil.setContentView( this, R.layout.activity_home)
        activityHomeBinding.executePendingBindings()
        onClickCards()


    }
    private fun onClickCards(){
        activityHomeBinding.apply {
            cards.chalisaCard.setOnClickListener {
                startReadActivity(1)
            }
            cards.apply {
                artiCard.setOnClickListener {
                    startReadActivity(2)
                }
            }
            cards.apply {
                bajrangBaanCard.setOnClickListener {
                    startReadActivity(3)
                }
            }
            cards.apply {
                namesCard.setOnClickListener {
                    startReadActivity(4)
                }
            }
            cards.apply {
                kirpluCard.setOnClickListener {
                    startReadActivity(5)
                }
            }
            cards.apply {
                mantarCard.setOnClickListener {
                    startReadActivity(6)
                }
            }

        }

    }

    private fun startReadActivity(i: Int) {
        val intent = Intent(this@HomeActivity, ReadActivity::class.java).apply { putExtra("pos",i) }
        startActivity(intent)

    }
}