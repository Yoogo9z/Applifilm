package com.example.appli_film

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appli_film.ui.theme.ApplifilmTheme
import androidx.compose.ui.draw.clip

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplifilmTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding)
                        ) {
                            SearchBarWithIcon()
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun SearchBarWithIcon() {
        var textState by remember { mutableStateOf(TextFieldValue("")) }
        val images = listOf(
            painterResource(R.drawable.image1),
            painterResource(R.drawable.image2),
            painterResource(R.drawable.image3)
        )
        Box(
            Modifier
                .fillMaxSize()
        ) {
            Column {

                Box(
                    Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxHeight(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Home Icon",
                            modifier = Modifier.size(30.dp),
                            tint = Color.Black
                        )
                        Spacer(modifier = Modifier.width(100.dp))
                        BasicTextField(
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
                Spacer(Modifier.weight(2.25f))
                Box(
                    Modifier
                        .fillMaxWidth()
                        .weight(2.5f)
                )
                {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .height(56.dp)
                            ,
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Filled.Home,
                                contentDescription = "Home Icon",
                                modifier = Modifier.size(24.dp),
                                tint = Color.Black
                            )
                            Spacer(modifier = Modifier.width(100.dp))
                            BasicTextField(
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

                    Spacer(Modifier.weight(2.25f))
                    Box(
                        Modifier
                            .background(Color.Green)
                            .fillMaxWidth()
                            .weight(2f)
                    )
                    {
                        Row(
                            modifier = Modifier
                                .height(40.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            Text(
                                text = "Halo"
                            )
                        }
                        Row(
                            modifier = Modifier
                                .height(18.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            Icon(
                                Icons.Filled.Star,
                                contentDescription = "Star Icon",
                                modifier = Modifier.size(18.dp),
                                tint = Color.Black
                            )
                            Icon(
                                Icons.Filled.Star,
                                contentDescription = "Star Icon",
                                modifier = Modifier.size(18.dp),
                                tint = Color.Black
                            )
                            Icon(
                                Icons.Filled.Star,
                                contentDescription = "Star Icon",
                                modifier = Modifier.size(18.dp),
                                tint = Color.Black
                            )
                            Icon(
                                Icons.Filled.Star,
                                contentDescription = "Star Icon",
                                modifier = Modifier.size(18.dp),
                                tint = Color.Black
                            )
                            Icon(
                                Icons.Outlined.Star,
                                contentDescription = "Star Icon",
                                modifier = Modifier.size(18.dp),
                                tint = Color.Black
                            )
                        }
                        Row(
                            modifier = Modifier
                                .height(18.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            Text(
                                text = "4.1/5",
                                modifier = Modifier
                            )
                        }
                        Row(
                            modifier = Modifier
                                .height(180.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            Text(
                                text = "Depiciting an epic 26th century conflict between humanity and an alien threat known as the Covenant, the series weaves deeply drawn personal stories with action, adventure and a richly imagined vision of the future",
                                modifier = Modifier
                            )
                        }

                        Row(
                            modifier = Modifier
                                .height(36.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            Text(
                                text = "Vous aimerez peut être",
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
                                    Image(
                                        painter = image,
                                        contentDescription = null,
                                        modifier = Modifier
                                            .padding(horizontal = 8.dp)
                                            .width(200.dp)
                                            .height(130.dp)
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
    }
        @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
        @Preview(showBackground = true)
        @Composable
        fun MoviePreview() {
            ApplifilmTheme {
                Scaffold {
                    SearchBarWithIcon()
                }
            }
        }