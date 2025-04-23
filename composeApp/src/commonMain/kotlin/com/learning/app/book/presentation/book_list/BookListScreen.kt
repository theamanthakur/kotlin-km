package com.learning.app.book.presentation.book_list
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.learning.app.book.domain.Book
import com.learning.app.book.presentation.book_list.composable.BookSearchBar
import com.learning.app.core.presentation.DarkBlue
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: (Book) -> Unit,
){

    val state by viewModel.state.collectAsStateWithLifecycle()

    BookListScreen(
        state = state,
        onAction = { action ->
            when(action){
                is BookListAction.OnBookClick -> onBookClick(action.book)
                else -> Unit
            }
            viewModel.onAction(action)
        }
    )
}


@Composable
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit
    ){

    val keyboardController = LocalSoftwareKeyboardController.current
    Column(
        modifier = Modifier.fillMaxSize().background(color = DarkBlue).statusBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        BookSearchBar(
            searchQuery = state.searchQuery,
            onSearchQueryChange = {
                onAction(BookListAction.OnSearchQueryChange(it))
            },
            onImeSearch = {
                keyboardController?.hide()
            },
            modifier = Modifier.widthIn(max = 400.dp).fillMaxWidth().padding(16.dp)
        )
    }
}