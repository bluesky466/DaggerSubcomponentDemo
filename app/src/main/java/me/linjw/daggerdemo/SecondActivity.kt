package com.cvte.tv.daggerdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity.*
import me.linjw.daggerdemo.MainActivity
import me.linjw.daggerdemo.R
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    @Inject
    lateinit var appCommonData: AppCommonData

    @Inject
    lateinit var secondActivityData: SecondActivityData


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)

        label.text = "appData: \n${appCommonData}\n\n\nactivityData:\n${secondActivityData}"
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}