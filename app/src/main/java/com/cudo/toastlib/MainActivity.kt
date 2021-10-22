package com.cudo.toastlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cudo.asadtoast.AsadToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AsadToast.showToast(this, "halo ini adalah toast buatan library sendiri")
    }
}