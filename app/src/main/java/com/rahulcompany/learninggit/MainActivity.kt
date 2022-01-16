package com.rahulcompany.learninggit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun printline(){
        Toast.makeText(applicationContext,"hello world",Toast.LENGTH_SHORT).show()
    }

    fun printline1(){
        Toast.makeText(applicationContext,"hello world 1",Toast.LENGTH_SHORT).show()    }
    fun printline2() {
        Toast.makeText(applicationContext,"hello world 2",Toast.LENGTH_SHORT).show()    }

    fun simpleprint() = Toast.makeText(applicationContext,"hello world simple",Toast.LENGTH_SHORT).show()


    fgfdg
    fdgfdg
    fdgfg
    fdgdg
    fdgfgdfggfg
}