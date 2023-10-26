package com.example.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen1() {
    /*Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {
        *//*Text(
            text = "Home screen",
            fontSize = 32.sp,
            color = Color.White,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(color = Color.Black)
                .fillMaxWidth(),

            )*//*
        Text(
            text = "Title",
            color = Color.Black,
            fontSize = 32.sp
        )
        Text(
            text = "Description",
            color = Color.Black,
            fontSize = 22.sp,
            modifier = Modifier.align(Alignment.Start)
        )
    }*/

    /*    Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Name", fontSize = 20.sp)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Surname", fontSize = 20.sp)
        }*/

    /*Column {
        Text(text = "N", fontSize = 48.sp,
            modifier = Modifier.background(Color.Green))
        Text(text = "ame",
            modifier = Modifier.background(Color.Gray))
    }*/
    /*    Row(verticalAlignment = Alignment.CenterVertically) {
            Box {
                Text(
                    text = "N", fontSize = 48.sp,
                    //modifier = Modifier.background(Color.Green)
                )
                Text(
                    text = "ame",
                    modifier = Modifier
                        // .background(Color.Gray)
                        .align(Alignment.BottomCenter)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.background(Color.Green).padding(start = 32.dp, top = 16.dp)) {
                Text(text = "Title")
                Text(text = "Description")
            }
        }*/

    /*if (list.isEmpty()) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Text(text = "Empty screen")
        }
    } else {
        Column {
            for (s in list) {
                Text(text = s)
            }
        }
    }*/

    Column(
        modifier = Modifier.padding(start = dimensionResource(id = R.dimen.large_padding))
    ) {
        Text(text = stringResource(id = R.string.home_screen_title))
        Text(text = stringResource(id = R.string.home_screen_description))
    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview1() {
    HomeScreen1()
}