package com.example.myapprestaurante

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapprestaurante.Api.BDRestauranteAPI
import com.example.myapprestaurante.Api.RetrofitHelper
import com.example.myapprestaurante.Entidades.Usuario
import com.example.myapprestaurante.databinding.ActivityRegisterBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response


class RegisterActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityRegisterBinding
//Inicializar esta denifida nd mas hasta que sea llamada
    private val retrofit by lazy{
        RetrofitHelper.retrofit
}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //
        binding.btnRegisten.setOnClickListener {
            //Contenido


        }
    }

private fun GrabarUsuario(){
    CoroutineScope(Dispatchers.IO).launch {
        PostGrabarUsuario()
    }
}
    private  suspend fun  PostGrabarUsuario()
    {
        var xcodi = 0
        var xnomb = binding.RegistroNombre.text.toString()
        var xcorre = binding.RegistroEmail.text.toString()
        var xpassword = binding.RegistroPassword.text.toString()
        var xrol = 2
        var obj = Usuario(xcodi,xnomb,xcorre,xpassword,xrol)

        var retorno : Response<Usuario>? = null
        try {
            val apicall =  retrofit.create(BDRestauranteAPI::class.java)
            retorno = apicall.PostGrabarUsuario(obj)
            Toast.makeText(applicationContext,
                "Nuevo Usuario Registrado correctamente",
                Toast.LENGTH_LONG).show()
        }
        catch (e:Exception){
    e.printStackTrace()
        }
    }

}