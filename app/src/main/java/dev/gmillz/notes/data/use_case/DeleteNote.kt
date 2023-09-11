package dev.gmillz.notes.data.use_case

import dev.gmillz.notes.data.model.Note
import dev.gmillz.notes.data.repo.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}