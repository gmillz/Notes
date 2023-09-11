package dev.gmillz.notes.data.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}