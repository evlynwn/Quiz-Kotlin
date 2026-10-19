package com.example.exercicioquiz.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercicioquiz.R

@Composable
fun TelaInicialScreen(modifier: Modifier = Modifier){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF83D8F7)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Logo App",
            modifier = Modifier.size(150.dp)
                .padding(vertical = 16.dp)
        )
        Spacer( modifier = Modifier.height(40.dp))
        Text(
            text = "QUIZATRON 3000",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Normal,
        )
        Spacer( modifier = Modifier.height(40.dp))
        Button(
            modifier = Modifier
                .width(300.dp)
                .height(60.dp),
            onClick = {

            },
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                Color(0xFFF9E158)
            )
        ) {
            Text(
                text = "COMECAR!",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            )
        }
    }

}
