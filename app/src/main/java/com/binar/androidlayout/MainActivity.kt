package com.binar.androidlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnActivity = findViewById(R.id.btnMainToLinear)
        btnActivity.setOnClickListener(this)

        btnActivity = findViewById(R.id.btnMainToGrid)
        btnActivity.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnMainToLinear -> run {
                val intentToLinear= Intent(this@MainActivity, LinearLayoutActivity::class.java)
                startActivity(intentToLinear)
            }

            R.id.btnMainToGrid -> run {
                val intentToGrid= Intent(this@MainActivity, GridLayoutActivity::class.java)
                startActivity(intentToGrid)
            }


        }
    }
}