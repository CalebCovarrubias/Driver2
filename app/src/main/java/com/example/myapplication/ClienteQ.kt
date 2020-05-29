package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_cliente_q.*
import kotlinx.android.synthetic.main.activity_quser.*
import kotlinx.android.synthetic.main.activity_quser.QButton

class ClienteQ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cliente_q)





        QButton.setOnClickListener(){

            showAlert()

            val home2Intent = Intent(this, Home2Activity::class.java).apply {
            }
            startActivity(home2Intent)

        }

        QuejasButton.setOnClickListener(){
            showAlertQuejas()
        }

        TicketButton.setOnClickListener(){
            showAlertTicket()
        }




    }

    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Calificado")
        builder.setMessage("Se ha calificado al usuario correctamente")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showAlertTicket(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error 404")
        builder.setMessage("Pagina en desarrollo")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showAlertQuejas(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error 404")
        builder.setMessage("Pagina en desarrollo")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showAlertValidation(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error 404")
        builder.setMessage("Pagina en desarrollo")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}
