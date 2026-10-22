package com.example.exercicioquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.exercicioquiz.screens.Perguntas2Screen
import com.example.exercicioquiz.screens.Perguntas3Screen
import com.example.exercicioquiz.screens.PerguntasScreen
import com.example.exercicioquiz.ui.theme.ExercicioQuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicioQuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Perguntas3Screen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
