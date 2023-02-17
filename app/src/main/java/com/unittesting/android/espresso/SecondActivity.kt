package com.unittesting.android.espresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unittesting.android.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val note = intent.getStringExtra("note").toString()
        txtResult.text = note

    }
}