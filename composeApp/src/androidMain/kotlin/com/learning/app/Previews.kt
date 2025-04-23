package com.learning.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.learning.app.book.domain.Book
import com.learning.app.book.presentation.book_list.composable.BookListItem
import com.learning.app.book.presentation.book_list.composable.BookSearchBar

@Preview
@Composable
fun BookSearchPreview() {
    Box(
        modifier = Modifier.background(color = Color.White)
    ) {
        BookSearchBar(
            "Java",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun BookListItemPreview(){
    BookListItem(
        onClick = {},
        book = Book(
            id = "UUID.randomUUID().toString()",
            title = "The Adventures of a Curious Coder",
            imageUrl = "https://example.com/images/curious_coder.jpg",
            authors = listOf("Ada Lovelace", "Charles Babbage"),
            description = "A thrilling tale of debugging, innovation, and the early days of computing.",
            languages = listOf("English", "French"),
            firstPublishYear = "1843",
            averageRating = 4.8,
            ratingCount = 1250,
            numPages = 350,
            numEditions = 5
        ),
        modifier = Modifier.fillMaxWidth()
    )
}
