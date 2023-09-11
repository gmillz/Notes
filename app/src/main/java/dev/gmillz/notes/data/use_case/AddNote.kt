package dev.gmillz.notes.data.use_case

import dev.gmillz.notes.data.model.InvalidNoteException
import dev.gmillz.notes.data.model.Note
import dev.gmillz.notes.data.repo.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}