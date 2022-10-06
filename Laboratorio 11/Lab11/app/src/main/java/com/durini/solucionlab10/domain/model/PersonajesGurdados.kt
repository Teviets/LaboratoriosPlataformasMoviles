package com.durini.solucionlab10.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class PersonajesGurdados(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val name: String,
    val species: String,
    val Status:String,
    val gender: String,
    val origin:String,
    val episodes:Int
)

