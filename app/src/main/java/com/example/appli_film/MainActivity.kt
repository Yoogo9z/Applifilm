package com.example.appli_film

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.appli_film.ui.theme.ApplifilmTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search

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

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(56.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BasicTextField(
            value = textState,
            onValueChange = { textState = it },
            modifier = Modifier
                .weight(1f)
                .background(Color.LightGray)
                .padding(horizontal = 16.dp, vertical = 12.dp),
            decorationBox = { innerTextField ->
                if (textState.text.isEmpty()) {
                    Text(text = "Search", color = Color.Gray)
                }
                innerTextField()
            }
        )
        Icon(
            Icons.Filled.Search,
            contentDescription = "Search Icon",
            modifier = Modifier.size(24.dp),
            tint = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SearchBarWithIconPreview() {
    ApplifilmTheme {
        Scaffold {
            SearchBarWithIcon()
        }
    }
}
