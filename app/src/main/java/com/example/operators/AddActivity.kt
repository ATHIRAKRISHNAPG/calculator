package com.example.operators

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
    }

    fun add(view: View) {
        var getno1=findViewById<EditText>(R.id.no1)
        var getno2=findViewById<EditText>(R.id.no2)
        var results=findViewById<TextView>(R.id.myres)
        var res=getno1.text.toString().toInt()+getno2.text.toString().toInt()
        results.text=res.toString()
        //Toast.makeText(this,results.toString(),Toast.LENGTH_LONG).show()

    }

    fun back(view: View) {
        intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}