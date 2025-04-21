package com.learning.app

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learning.app.book.presentation.book_list.composable.BookSearchBar

@Preview
@Composable
fun BookSearchPreview(){
    MaterialTheme{
        BookSearchBar("Kotlin", onSearchQueryChange = {}, onImeSearch = {}, modifier = Modifier.fillMaxWidth())
    }
}