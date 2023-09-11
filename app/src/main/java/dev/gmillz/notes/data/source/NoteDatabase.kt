package dev.gmillz.notes.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.gmillz.notes.data.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}