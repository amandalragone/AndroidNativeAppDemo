package com.amandalragone.androidnativeappdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactFragment
import com.walmartlabs.ern.container.miniapps.EndeavorminiappActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bundle = Bundle().apply {
            putString("buttonText", "Print message")
            putString("buttonColor", "#ff0092")
        }

        var intent =  Intent(this, EndeavorminiappActivity::class.java).apply { bundle }
//        intent.putExtra("props", bundle)
        startActivity(intent)

    }
}