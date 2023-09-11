package dev.gmillz.notes.data.use_case

import dev.gmillz.notes.data.model.Note
import dev.gmillz.notes.data.repo.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}