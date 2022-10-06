package com.durini.solucionlab10.data.local_source

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.durini.solucionlab10.domain.model.PersonajesGurdados
import retrofit2.http.DELETE

interface PersonajesGuardadosDao {
    @Query ("SELECT * FROM PersonajesGurdados")
    suspend fun getAllLoadCharacters(): List<PersonajesGurdados>

    @Query ("SELECT * FROM personajesgurdados WHERE id = :id")
    suspend fun getLoadCharacter(id: Int): PersonajesGurdados

    @Insert
    suspend fun createLoadCharacter(personaje: PersonajesGurdados)

    @Delete
    suspend fun deleteLoadCharacter(personaje: PersonajesGurdados)

    @Update
    suspend fun update(personaje: PersonajesGurdados)

    @Query ("DELETE FROM PersonajesGurdados")
    suspend fun deleteAll(): Int
}