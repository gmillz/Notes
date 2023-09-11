package dev.gmillz.notes.data.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val getNote: GetNote,
    val addNote: AddNote,
    val deleteNote: DeleteNote
)