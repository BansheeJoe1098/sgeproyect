package com.example.plataformaescolar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

       // binding.numeroControlR.setText(jsonUsuario.getString("noControl"))
       // binding.nombreR.setText(jsonUsuario.getString("nombre"))
        //binding.carreraR.setText(jsonUsuario.getString("carrera"))
       // binding.semestreR.setText(jsonUsuario.getString("semestre"))
       // binding.contrasenaR.setText(jsonUsuario.getString("contrasena"))

        binding.btnRegistro.setOnClickListener {
                
        }

        binding.btnRegresar.setOnClickListener {
            val intent = Intent(this, Reinscripcion::class.java)
            startActivity(intent)
            finish()
        }



    }
}