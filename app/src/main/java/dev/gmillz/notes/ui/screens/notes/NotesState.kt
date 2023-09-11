package dev.gmillz.notes.ui.screens.notes

import dev.gmillz.notes.data.model.Note
import dev.gmillz.notes.data.util.NoteOrder
import dev.gmillz.notes.data.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)