package com.example.appli_film

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appli_film.ui.theme.ApplifilmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplifilmTheme {
                Scaffold (modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Bonsoir",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface (color = Color.Red) {
        Text(
            text = "Oui $name",
            modifier = modifier)
        Text(
            text = "Ok $name",
            modifier = Modifier.padding(24.dp))
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApplifilmTheme {
//        Greeting("Android")
        Scaffold(modifier = Modifier.fillMaxSize()) {  innerPadding ->
            Column(modifier = Modifier.padding(start = 25.dp)) {
                Text(
                    text = "Ok",
                    modifier = Modifier.padding(24.dp)
                )
                Text(
                    text = "Ok",
                    modifier = Modifier.padding(24.dp)
                )
                Text(
                    text = "Ok",
                    modifier = Modifier.padding(24.dp)
                )
                Text(
                    text = "Ok",
                    modifier = Modifier.padding(24.dp)
                )
                Text(
                    text = "Ok",
                    modifier = Modifier.padding(24.dp)
                )

            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Greeting() {
    ApplifilmTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {  innerPadding ->
            Column(modifier = Modifier.padding(start = 25.dp)) {
                Text(
                    text = "Ok",
                    modifier = Modifier.padding(24.dp)

                )
                Icon(Icons.Filled.PlayArrow, contentDescription = "" )
            }
        }
    }
}
