package com.durini.solucionlab10.data.local_source

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [PersonajesGuardadosDao::class],
    version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun personajesDao(): PersonajesGuardadosDao
}