package com.example.plataformaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import org.json.JSONObject
import com.example.plataformaescolar.databinding.ActivityResidenciaBinding

class Residencia : AppCompatActivity() {
    private lateinit var binding:ActivityResidenciaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResidenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var usuario = intent.getStringExtra("usuario")
        val jsonUsuario = JSONObject(usuario)
        val jsonUsuarioEdit = jsonUsuario
       // val Proyecto = intent.getStringExtra("ProyectoR")



        binding.numeroControlR.setText(jsonUsuario.getString("noControl"))
        binding.nombreR.setText(jsonUsuario.getString("nombre"))
        binding.carreraR.setText(jsonUsuario.getString("carrera"))
        binding.semestreR.setText(jsonUsuario.getString("semestre"))



        binding.btnRegistro.setOnClickListener {
            Toast.makeText(this,"Se confirmo su Residencia",Toast.LENGTH_SHORT).show()
               // if (Proyecto.isEmpty()){

               // }
        }

        binding.btnRegresar.setOnClickListener {
            val intent = Intent(this, Reinscripcion::class.java)
            startActivity(intent)
            finish()
        }



    }
}