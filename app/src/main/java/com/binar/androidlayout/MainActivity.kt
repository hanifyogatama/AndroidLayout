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

        btnActivity = findViewById(R.id.btnMainToFrame)
        btnActivity.setOnClickListener(this)

        btnActivity = findViewById(R.id.btnMainToRelative)
        btnActivity.setOnClickListener(this)

        btnActivity = findViewById(R.id.btnMainToTable)
        btnActivity.setOnClickListener(this)

        btnActivity = findViewById(R.id.btnMainToConstraint)
        btnActivity.setOnClickListener(this)

        btnActivity = findViewById(R.id.btnMainToCard)
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

            R.id.btnMainToFrame -> run {
                val intentToFrame= Intent(this@MainActivity, FrameLayoutActivity::class.java)
                startActivity(intentToFrame)
            }

            R.id.btnMainToRelative -> run {
                val intentToRelatve= Intent(this@MainActivity, RelativeLayoutActivity::class.java)
                startActivity(intentToRelatve)
            }

            R.id.btnMainToTable -> run {
                val intentToTable= Intent(this@MainActivity, TableLayoutActivity::class.java)
                startActivity(intentToTable)
            }

            R.id.btnMainToConstraint -> run {
                val intentToConstraint= Intent(this@MainActivity, ConstraintLayoutActivity::class.java)
                startActivity(intentToConstraint)
            }

            R.id.btnMainToCard -> run {
                val intentToCard= Intent(this@MainActivity, CardViewActivity::class.java)
                startActivity(intentToCard)
            }


        }
    }
}