package com.example.applibrary.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.applibrary.books

@Composable
fun BookDetailScreen(
    id: Int
){

    val colors = MaterialTheme.colorScheme
    val typography = MaterialTheme.typography
    //EMULAR PETICION A API
    val book = books.firstOrNull{ b -> b.id == id}


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background)
    ){

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .clip(RoundedCornerShape(bottomStart = 75.dp))
                .background(colors.primary)
                //.padding(innerPadding)
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            AsyncImage(
                model = book?.imageUrl ?: "",
                contentDescription = book?.title ?: "Sin titulo",
                modifier = Modifier
                    .width(150.dp)
                    .height(250.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.secondary)
            )

            Column(
                modifier = Modifier
                    .padding(top = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(
                    text = book?.title ?: "Sin titulo",
                    style = typography.titleMedium,
                    color = colors.onPrimary
                )
                Text(
                    text = book?.author ?: "Sin descripcion",
                    color = colors.onPrimary
                )
            }

            //Iconos
            Row(
                modifier = Modifier
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                //Rating
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(colors.onPrimary)
                        .padding(horizontal = 15.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        text = "RATING",
                        fontWeight = FontWeight.Bold,
                        style = typography.labelSmall,
                        color = colors.primary
                    )
                    Text(
                        text = book?.rating.toString() ?: "Sin rating",
                        style = typography.bodyMedium,
                        color = colors.primary
                    )
                }

                //PAGINAS
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(colors.onPrimary)
                        .padding(horizontal = 15.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        text = "PAG",
                        fontWeight = FontWeight.Bold,
                        style = typography.labelSmall,
                        color = colors.primary
                    )
                    Text(
                        text = book?.pages ?: "Sin rating",
                        style = typography.bodyMedium,
                        color = colors.primary
                    )
                }

                //Audio
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(colors.onPrimary)
                        .padding(horizontal = 15.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        text = "AUDIO",
                        fontWeight = FontWeight.Bold,
                        style = typography.labelSmall,
                        color = colors.primary
                    )
                    Text(
                        text = book?.audio ?: "Sin rating",
                        style = typography.bodyMedium,
                        color = colors.primary
                    )
                }

                //LENG
                Column(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(colors.onPrimary)
                        .padding(horizontal = 15.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Text(
                        text = "LENG",
                        fontWeight = FontWeight.Bold,
                        style = typography.labelSmall,
                        color = colors.primary
                    )
                    Text(
                        text = book?.language ?: "Sin rating",
                        style = typography.bodyMedium,
                        color = colors.primary
                    )
                }

            }
        }

        /*
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
        */

    }
}


@Preview
@Composable
fun BookDetailScreenPreview(){
    BookDetailScreen(1)
}
