package com.example.myapprestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.btnEntrar)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Redirigimos a RegisterActivity
                startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
            }
        })
    }
}
