package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home2.*

class Home2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        title = "En servicio"
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")

        emailTextView2.text = email



        /*
        En esta parte agregamos la funcionalidad del boton de cerrar sesion despues de que el Driver activa el servicio
         */



        logOutButton.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
            val mainIntent = Intent(this,MainActivity::class.java).apply {
                putExtra("email", email)

            }
            startActivity(mainIntent)


        }


        takebutton.setOnClickListener(){
            val serviceIntent = Intent(this,ServiceActivity::class.java).apply {
            }
            startActivity(serviceIntent)
        }






    }




}


