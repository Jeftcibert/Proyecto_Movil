package com.example.myapprestaurante.Entidades


/*CREATE TABLE Usuario (
  IdUsuario  int IDENTITY(1,1) not null primary key,
  nombre varchar(100)  not null,
  correo varchar(200) not null,
  clave  varchar(200) not null,
  rol int not null,*/


data class Usuario(

    var id : Int,
    var nombre: String,
    var correo: String,
    var clave:String,
    var rol:Int

)
