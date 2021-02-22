package com.example.autofilltest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.autofilltest2.ui.main.BlankFragment
import com.example.autofilltest2.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment(::naveateTo))
                    .commitNow()
        }
    }

    fun naveateTo(){
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, BlankFragment(::naveateTo2))
                .commitNow()
    }

    fun naveateTo2(){
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment(::naveateTo))
                .commitNow()
    }
}