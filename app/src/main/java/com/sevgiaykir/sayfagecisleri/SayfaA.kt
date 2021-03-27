package com.sevgiaykir.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sayfa_a.*

class SayfaA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_a)

        buttonAdanBye.setOnClickListener{
            val intent= Intent(this@SayfaA,SayfaB::class.java)
            //finish()
            startActivity(intent)
        }
    }
}