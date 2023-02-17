package com.unittesting.android.espresso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unittesting.android.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val title = edtTitle.text.toString().trim()
            val desc = edtDescription.text.toString().trim()
            val note = "Title: $title | Description: $desc"

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("note", note)
            startActivity(intent)
        }
    }
}