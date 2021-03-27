package com.sevgiaykir.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAnasayfadanAya.setOnClickListener{
            val intent=Intent(this@MainActivity,SayfaA::class.java)
            finish()
            startActivity(intent)
        }

        buttonAnasayfadanXe.setOnClickListener{
            val intent=Intent(this@MainActivity,SayfaX::class.java)
            //finish()
            startActivity(intent)
        }
    }
}