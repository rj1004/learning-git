package com.rahulcompany.learninggit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun printline(){
        println("hello world from feature_printmethod")
    }

    fun printline1(){
        println("hello world from feature_printmethod1")
    }
    fun printline2() {
        println("hello world from feature_printmethod2")
    }

    fun simpleprint() = println("hello from simple")


}