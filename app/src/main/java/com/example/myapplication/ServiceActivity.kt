package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_service.*

class ServiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)


        RechazarButton.setOnClickListener(){
            val rejectIntent = Intent(this, Home2Activity::class.java).apply {

            }
            startActivity(rejectIntent)
        }

        AceptarButton.setOnClickListener(){

            val roadIntent = Intent(this,EnViaje::class.java).apply {
            }
            startActivity(roadIntent)
        }


    }


}