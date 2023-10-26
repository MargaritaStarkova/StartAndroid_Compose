package com.example.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun HomeScreen() {
/*    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .width(160.dp)
                .height(120.dp)
                *//*  .background(
                      brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Yellow, Color.Green)),
                      alpha = 0.2f,
                      shape = RoundedCornerShape(16.dp)
                  )*//*
                .background(color = Color.Cyan, shape = RoundedCornerShape(16.dp))
                .border(
                    width = 2.dp,
                    //color = Color.DarkGray,
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Red, Color.Yellow, Color.Green
                        )
                    ),
                    shape = CircleShape
                )
        )
    }*/

/*    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.sand), contentDescription = null)
        Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
    }*/

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        AsyncImage(
            model = "https://developer.android.com/images/android-go/next-billion-users_856.png",
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}