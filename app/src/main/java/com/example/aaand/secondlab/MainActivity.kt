package com.example.aaand.secondlab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var goals1 = 0
    var falls1 = 0
    var goals2 = 0
    var falls2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun observer() {
        findViewById<TextView>(R.id.leftGoals).setText(goals1.toString())
        findViewById<TextView>(R.id.rightGoals).setText(goals2.toString())
        findViewById<TextView>(R.id.leftFalls).setText(falls1.toString())
        findViewById<TextView>(R.id.rightFalls).setText(falls2.toString())
    }

    fun addGoal1(view: View) {
        Toast.makeText(this, "ADDED GOAL", Toast.LENGTH_SHORT).show()
        goals1 += 1
        observer()
    }
    fun addGoal2(view: View) {
        Toast.makeText(this, "ADDED GOAL", Toast.LENGTH_SHORT).show()
        goals2 += 1
        observer()
    }

    fun addFall1(view: View) {
        Toast.makeText(this, "ADDED FALL", Toast.LENGTH_SHORT).show()
        falls1 += 1
        observer()
    }
    fun addFall2(view: View) {
        Toast.makeText(this, "ADDED FALL", Toast.LENGTH_SHORT).show()
        falls2 += 1
        observer()
    }
    fun clear(view: View) {
        goals1 = 0
        goals2 = 0
        falls1 = 0
        falls2 = 0
        observer()
    }
}
