package com.sevgiaykir.sayfagecisleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SayfaY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_y)

    }

    override fun onBackPressed() {
        val cikisIntent=Intent(Intent.ACTION_MAIN)
        cikisIntent.addCategory(Intent.CATEGORY_HOME)
        cikisIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(cikisIntent)

        val intent= Intent(this@SayfaY,MainActivity::class.java)
        startActivity(intent)
    }
}