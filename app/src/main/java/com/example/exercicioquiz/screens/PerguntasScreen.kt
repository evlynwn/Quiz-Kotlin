package com.example.exercicioquiz.screens

import android.R.attr.fontWeight
import android.graphics.Paint
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercicioquiz.R

@Composable
fun PerguntasScreen( modifier: Modifier ){
    Column(modifier = Modifier.fillMaxSize()
        .background(Color(0xFFEF97CF))
        .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Logo App",
            modifier = Modifier.size(90.dp)
                .padding(vertical = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Card(
            modifier = Modifier
                .height(60.dp)
                .width(400.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF89D4A6)
            ),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(
                text = "Pergunta 1 de 3",
                fontSize = 29.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 15.dp),
                color = Color(0xFF000000)
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Text(
                    text = "Quem escreveu a obra 'Futuro Ancestral' ?",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    modifier = Modifier
                        .width(300.dp)
                        .height(48.dp),
                    onClick = {

                    },
                    border = BorderStroke(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFFFFFFF)
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "Eliane Potiguara",
                        color = Color(0xFF000000)
                    )

                }
                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    modifier = Modifier
                        .width(300.dp)
                        .height(48.dp),
                    onClick = {

                    },
                    border = BorderStroke(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFFFFFFF)
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "Conceição Evaristo",
                        color = Color(0xFF000000)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    modifier = Modifier
                        .width(300.dp)
                        .height(48.dp),
                    onClick = {

                    },
                    border = BorderStroke(1.dp, Color.Gray),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFFFFFFF)
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "Darcy Ribeiro",
                        color = Color(0xFF000000)
                    )
                }
                    Spacer(modifier = Modifier.height(20.dp))

                Button(
                    modifier = Modifier
                        .width(300.dp)
                        .height(48.dp),
                    onClick = {

                    },
                    border = BorderStroke(1.dp,Color.Gray),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFFFFFFF)
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(
                        text = "Ailton Krenak",
                        color = Color(0xFF000000)
                    )
                }
            }
        }
    }
}