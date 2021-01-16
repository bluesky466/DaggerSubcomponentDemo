package me.linjw.daggerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cvte.tv.daggerdemo.AppCommonData
import com.cvte.tv.daggerdemo.MainActivityData
import com.cvte.tv.daggerdemo.DemoApplication
import com.cvte.tv.daggerdemo.SecondActivity
import kotlinx.android.synthetic.main.activity.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var appCommonData: AppCommonData

    @Inject
    lateinit var mainActivityData: MainActivityData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)

        (applicationContext as DemoApplication).inject(this)

        label.text = "appData: \n${appCommonData}\n\n\nactivityData:\n${mainActivityData}"
        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
