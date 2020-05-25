package com.example.driver_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonIngresar.setOnClickListener()
        {
            val intent:Intent = Intent(this, PantallaMenu::class.java)
            startActivity(intent)
        }
    }
}