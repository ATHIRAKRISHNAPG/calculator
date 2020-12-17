package com.example.operators

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ADD(view: View) {
        intent= Intent(this,AddActivity::class.java)
        startActivity(intent)
    }
    fun SUB(view: View) {
        intent= Intent(this,SubActivity::class.java)
        startActivity(intent)
    }
    fun MUL(view: View) {
        intent= Intent(this,MultiActivity2::class.java)
        startActivity(intent)
    }
    fun DIV(view: View) {
        intent= Intent(this,DivActivity::class.java)
        startActivity(intent)
    }
}