package edu.iest.primerparcial

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bnComprar = findViewById<Button>(R.id.comprarBoletos)
        val funcion = findViewById<Spinner>(R.id.funciones)
        val texto = funcion.selectedItem.toString()

        bnComprar.setOnClickListener {
            if (texto == "15:00 SUB" || texto == "17:00 3D ESP" || texto == "19:00 ESP"){
                Toast.makeText(this, "Lo sentimos se han agotado las funciones", Toast.LENGTH_LONG).show()
            }
        }
    }
}