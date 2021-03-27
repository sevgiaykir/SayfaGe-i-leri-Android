package com.sevgiaykir.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_a.*
import kotlinx.android.synthetic.main.activity_sayfa_b.*

class SayfaB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_b)

        buttonBdenYye.setOnClickListener{
            val intent= Intent(this@SayfaB,SayfaY::class.java)
            //finish()
            startActivity(intent)
        }
    }
}