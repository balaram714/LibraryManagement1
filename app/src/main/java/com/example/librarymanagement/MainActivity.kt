package com.example.librarymanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_btn.setOnClickListener{
          var status=  if(username_et.text.toString().equals("technowordid")
                && paasword_et.text.toString().equals("password") )"login succesfull" else "login fail"
            Toast.makeText(this,"status", Toast.LENGTH_SHORT).show()
        }

    }
}
