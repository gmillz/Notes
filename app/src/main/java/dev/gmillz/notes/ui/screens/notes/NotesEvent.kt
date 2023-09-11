package dev.gmillz.notes.ui.screens.notes

import dev.gmillz.notes.data.model.Note
import dev.gmillz.notes.data.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}