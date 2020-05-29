package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_en_viaje.*

class EnViaje : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_en_viaje)



        CancelarViajeButton.setOnClickListener(){
            val cancelIntent = Intent(this, Home2Activity::class.java).apply {

            }
            startActivity(cancelIntent)
        }


        FinalizaViajebutton.setOnClickListener(){
            val qUserIntent = Intent ( this,ClienteQ::class.java).apply{

            }
            startActivity(qUserIntent)
        }

        VerMapaButton.setOnClickListener(){
            val verIntent = Intent( this, MapsActivity::class.java).apply {

            }
            startActivity(verIntent)
        }

    }
}
