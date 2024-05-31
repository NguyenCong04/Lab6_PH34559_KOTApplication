package com.congntph34559.fpoly.lab6_ph34559_kotapplication.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.congntph34559.fpoly.lab6_ph34559_kotapplication.model.entities.Movie

@Composable
fun GetLayoutExerciseOne(movie: List<Movie>) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            items(movie) {
                MovieItemExercise(it)
            }
        }

    }

}

@Composable
fun MovieItemExercise(item: Movie) {

    Card(
        colors = CardDefaults.cardColors(
            Color.White
        ),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 3.dp
        ),
        modifier = Modifier.padding(start = 10.dp, end = 8.dp, top = 20.dp),
        shape = RoundedCornerShape(8.dp)
    ) {

        Column(
            modifier = Modifier
        ) {
            AsyncImage(
                model = item.posterUrl,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(255.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Text(
                    text = item.title,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif
                )

                Text(
                    text = "Thời lượng: ${item.year}",
                    fontFamily = FontFamily.Serif
                )
            }

        }

    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingExercise() {
    GetLayoutExerciseOne(movie = Movie.getSampleMovie())
}