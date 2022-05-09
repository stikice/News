package com.example.newsapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val transaction = supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment1Container, FragmentNews(), "FragmentNews")

        //transaction.addToBackStack(null)
        transaction.commit()
        val fm: FragmentManager = supportFragmentManager

        findViewById<TextView>(R.id.arrowLeft).setOnClickListener {
            fm.popBackStack()
        }

        findViewById<TextView>(R.id.arrowRight).setOnClickListener {
            println(fm.backStackEntryCount)
            fm.getBackStackEntryAt(0)
        }
    }
}