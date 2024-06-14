package com.example.appli_film

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.sharp.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appli_film.ui.theme.ApplifilmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplifilmTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
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

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .height(56.dp),
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
        Row(
            modifier = Modifier
                .height(56.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        )
        {

        }
        Row(
            modifier = Modifier
                .height(56.dp),
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
                Icons.Sharp.Star,
                contentDescription = "Star Icon",
                modifier = Modifier.size(18.dp),
                tint = Color.Black
            )
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
