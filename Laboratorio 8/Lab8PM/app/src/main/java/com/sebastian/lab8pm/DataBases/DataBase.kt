package com.sebastian.lab8pm.DataBases

import com.sebastian.lab8pm.entities.Estatus
import com.sebastian.lab8pm.entities.Genero
import com.sebastian.lab8pm.entities.Place
import java.util.*

object DataBase{

    private val places = mutableListOf(
        Place (name = "Bootleg Portal Chemist Rick", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/56.jpeg"),
        Place (name = "Steve Jobs Rick", especie = "Human", Status = Estatus.VIVO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/483"),
        Place (name = "Robot Rick", especie = "Robot", Status = Estatus.UNKNOWN, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/299"),
        Place (name = "Josh", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/609"),
        Place (name = "Morty´s Mother-in-law", especie = "Human", Status = Estatus.VIVO, genero = Genero.FEMENINO, imagen = "https://rickandmortyapi.com/api/character/avatar/660"),
        Place (name = "Rick Sanchez", especie = "Human", Status = Estatus.VIVO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/1"),
        Place (name = "Morty Smith", especie = "Human", Status = Estatus.VIVO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/2"),
        Place (name = "Beth Sanchez", especie = "Human", Status = Estatus.VIVO, genero = Genero.FEMENINO, imagen = "https://rickandmortyapi.com/api/character/avatar/37"),
        Place (name = "Unmuscular Michael", especie = "Human", Status = Estatus.VIVO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/373"),
        Place (name = "Cop Morty", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/73"),
        Place (name = "Cirque du Soleil Zumanity Member", especie = "Human", Status = Estatus.VIVO, genero = Genero.FEMENINO, imagen = "https://rickandmortyapi.com/api/character/avatar/737"),
        Place (name = "Gotron Pilot", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/777"),
        Place (name = "Stair Goblin", especie = "Mythological Creature", Status = Estatus.VIVO, genero = Genero.DESCONOCIDO, imagen = "https://rickandmortyapi.com/api/character/avatar/333"),
        Place (name = "Alan Rails", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/10"),
        Place (name = "Albert Einstein", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/11"),
        Place (name = "Alexander", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/12"),
        Place (name = "Summer Smith", especie = "Human", Status = Estatus.VIVO, genero = Genero.FEMENINO, imagen = "https://rickandmortyapi.com/api/character/avatar/3"),
        Place (name = "Beth Smith", especie = "Human", Status = Estatus.VIVO, genero = Genero.FEMENINO, imagen = "https://rickandmortyapi.com/api/character/avatar/4"),
        Place (name = "Jerry Smith", especie = "Human", Status = Estatus.VIVO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/5"),
        Place (name = "Abadango Cluster Princess", especie = "Alien", Status = Estatus.VIVO, genero = Genero.FEMENINO, imagen = "https://rickandmortyapi.com/api/character/avatar/6"),
        Place (name = "Abradolf Lincler", especie = "Human", Status = Estatus.UNKNOWN, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/7"),
        Place (name = "Adjudicator Rick", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/8"),
        Place (name = "Agency Director", especie = "Human", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/9"),
        Place (name = "Alien Googah", especie = "Alien", Status = Estatus.UNKNOWN, genero = Genero.DESCONOCIDO, imagen = "https://rickandmortyapi.com/api/character/avatar/13"),
        Place (name = "Alien Morty", especie = "Alien", Status = Estatus.UNKNOWN, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/14"),
        Place (name = "Alien Rick", especie = "Alien", Status = Estatus.UNKNOWN, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/15"),
        Place (name = "Amish Cyborg", especie = "Alien", Status = Estatus.MUERTO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/16"),
        Place (name = "Annie", especie = "Human", Status = Estatus.VIVO, genero = Genero.FEMENINO, imagen = "https://rickandmortyapi.com/api/character/avatar/17"),
        Place (name = "Antenna Morty", especie = "Human", Status = Estatus.VIVO, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/18"),
        Place (name = "Antenna Rick", especie = "Human", Status = Estatus.UNKNOWN, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/19"),
        Place (name = "Ants in my Eyes Johnson", especie = "Human", Status = Estatus.UNKNOWN, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/20"),
        Place (name = "Aqua Morty", especie = "Humanoid", Status = Estatus.UNKNOWN, genero = Genero.MASCULINO, imagen = "https://rickandmortyapi.com/api/character/avatar/21")
    )

    fun getPlaces() = places
}