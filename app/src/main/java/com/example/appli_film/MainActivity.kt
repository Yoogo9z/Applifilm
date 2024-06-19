package com.example.appli_film

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appli_film.ui.theme.ApplifilmTheme
import com.example.appli_film.components.ImageScroll

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            window.navigationBarColor = Color.Black.toArgb()
            window.statusBarColor = Color.Black.toArgb()
            setContent {
                MoviePreview()
            }
        }

    @Composable
    fun SearchBarWithIcon(modifier: Modifier = Modifier) {
        var textState by remember { mutableStateOf(TextFieldValue("")) }
        Column(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Box(
                Modifier
//                    .background(Color.Red)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = modifier
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Home,
                        contentDescription = "Home Icon",
                        modifier = Modifier.size(30.dp),
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(100.dp))
                    BasicTextField(
//                        value = query,
//                        onValueChange = { println(it) }
                        value = textState,
                        onValueChange = { textState = it },
                        modifier = Modifier
                            .weight(1f)
                            .background(Color.LightGray, RoundedCornerShape(8.dp))
                            .padding(vertical = 12.dp, horizontal = 16.dp)
                            .height(20.dp),
                        decorationBox = { innerTextField ->
                            if (textState.text.isEmpty()) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        Icons.Filled.Search,
                                        contentDescription = "Search Icon",
                                        modifier = Modifier.size(16.dp),
                                        tint = Color.Gray
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "Rechercher un film",
                                        color = Color.Gray
                                    )
                                }
                            } else {
                                innerTextField()
                            }
                        }
                    )
                }
            }
        }
    }

    @Composable
    fun Avis(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Box(
                Modifier
//                    .background(Color.Green)
                    .fillMaxWidth()
                    .weight(2f)
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Halo",
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Filled.Star,
                            contentDescription = "Star Icon",
                            modifier = Modifier.size(18.dp),
                            tint = Color.White
                        )
                        Icon(
                            Icons.Filled.Star,
                            contentDescription = "Star Icon",
                            modifier = Modifier.size(18.dp),
                            tint = Color.White
                        )
                        Icon(
                            Icons.Filled.Star,
                            contentDescription = "Star Icon",
                            modifier = Modifier.size(18.dp),
                            tint = Color.White
                        )
                        Icon(
                            Icons.Filled.Star,
                            contentDescription = "Star Icon",
                            modifier = Modifier.size(18.dp),
                            tint = Color.White
                        )
                        Icon(
                            Icons.Outlined.Star,
                            contentDescription = "Star Icon",
                            modifier = Modifier.size(18.dp),
                            tint = Color.White
                        )

                    }
                    Row(
                        modifier = Modifier,
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "4.1/5",
                            modifier = Modifier,
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier
//                                .height(180.dp)
                        ,
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Depicting an epic 26th century conflict between humanity and an alien threat known as the Covenant, the series weaves deeply drawn personal stories with action, adventure and a richly imagined vision of the future",
                            modifier = Modifier,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }

    @Composable
    fun List(images: List<Painter>, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxWidth()
        ) {
            Box(
                Modifier
//                    .background(Color.Blue)
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .height(36.dp),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = ("Vous aimerez peut être"),
                            color = Color.White,
                            modifier = Modifier
                        )
                    }
                    Row(
                        modifier = Modifier
                            .height(130.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        LazyRow(
                            modifier = Modifier
                        ) {
                            items(images) { image ->
                                ImageScroll(
                                    painter = image,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(horizontal = 8.dp)
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .clip(RoundedCornerShape(14.dp)),
                                    contentScale = ContentScale.Crop
                                )
                                Image(
                                    painter = image,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .padding(horizontal = 8.dp)
                                        .weight(1f)
                                        .fillMaxHeight()
                                        .clip(RoundedCornerShape(14.dp)),
                                    contentScale = ContentScale.Crop
                                )
                            }
                        }
                    }
                }
            }
        }
    }


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun MoviePreview() {
        ApplifilmTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Box {
                            Image(
                                painter = painterResource(R.drawable.imagehalo),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color.Black),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                        ) {
                            Box(
                                Modifier
                                    .weight(1f)
                                    .fillMaxHeight()
                                    .fillMaxWidth()
                            ) {
                                SearchBarWithIcon()
                            }
                            Spacer(modifier = Modifier.weight(2.25f))
                            Avis(Modifier.weight(2.5f))
                            Spacer(modifier = Modifier.weight(2.25f))
                            List(
                                images = listOf(
                                    painterResource(R.drawable.image1),
                                    painterResource(R.drawable.image2),
                                    painterResource(R.drawable.image3)
                                ),
                                modifier = Modifier.weight(2f)
                            )
                        }
                    }
                }
            }
        }
    }
}

