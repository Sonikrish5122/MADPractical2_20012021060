package com.example.madpractical2_20012021060

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var myc1: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myc1=findViewById(R.id.myc1)
        Log.i(TAG, "onCreate: Method is called")
        Toast.makeText(this,"onCreate: Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(myc1, "onCreate: Method is called",Snackbar.LENGTH_LONG ).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: Method is called")
        Toast.makeText(this,"onStart: Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(myc1, "onStart: Method is called",Snackbar.LENGTH_LONG ).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: Method is called")
        Toast.makeText(this,"onResume: Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(myc1, "onResume: Method is called",Snackbar.LENGTH_LONG ).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: Method is called")
        Toast.makeText(this,"onPause: Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(myc1, "onPause: Method is called",Snackbar.LENGTH_LONG ).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: Method is called")
        Toast.makeText(this,"onStop: Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(myc1, "onStop: Method is called",Snackbar.LENGTH_LONG ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: Method is called")
        Toast.makeText(this,"onDestroy: Method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(myc1, "onDestroy: Method is called",Snackbar.LENGTH_LONG ).show()
    }
}
