package com.learning.app
import androidx.compose.runtime.*
import com.learning.app.book.presentation.book_list.BookListScreenRoot
import com.learning.app.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember{BookListViewModel()},
        onBookClick = {}
    )
}