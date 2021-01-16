package me.linjw.daggerdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cvte.tv.daggerdemo.AppCommonData
import com.cvte.tv.daggerdemo.MainActivityData
import com.cvte.tv.daggerdemo.SecondActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var appCommonData: AppCommonData

    @Inject
    lateinit var mainActivityData: MainActivityData

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)

        label.text = "appData: \n${appCommonData}\n\n\nactivityData:\n${mainActivityData}"
        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
