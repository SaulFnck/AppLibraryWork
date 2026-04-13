package com.example.applibrary.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.applibrary.books

@Composable
fun BookDetailScreen(
    id: Int
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        //EMULAR PETICION A API
        val book = books.firstOrNull{ b -> b.id == id}
        AsyncImage(
            model = book?.imageUrl ?: "",
            contentDescription = book?.title ?: "Sin titulo",
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = book?.title ?: "Sin titulo"
        )
        Text(
            text = book?.author ?: "Sin Autor"
        )
    }
}

/*
@Preview
@Composable
fun BookDetailScreenPreview(){
    BookDetailScreen(id)
}
*/
