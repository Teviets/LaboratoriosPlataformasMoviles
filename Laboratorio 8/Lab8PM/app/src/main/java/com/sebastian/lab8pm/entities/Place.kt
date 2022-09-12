package com.sebastian.lab8pm.entities

import java.io.Serializable

data class Place (
    val name:String,
    val especie:String,
    val Status: Estatus,
    val imagen: String,
    val genero: Genero
    ):Serializable

enum class Genero{
    MASCULINO,
    FEMENINO,
    DESCONOCIDO
}
enum class Estatus{
    VIVO,
    MUERTO,
    UNKNOWN
}