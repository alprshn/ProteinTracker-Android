package com.example.proteintracker_android.protein_tracker.presentation.weight_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.draw.clip

@Composable
fun WeightScreen() {
    // Ana Container
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF003B52)) // Arka plan rengi
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Başlık
        Text(
            text = "Your Current Weight",
            fontSize = 24.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 20.dp)
        )

        // Tartı Kısmı
        Column(
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(20.dp)) // Kenarları yuvarlak
                .background(Color(0xFF005C71)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp) // Yüksekliği 150 dp
                    .clip(RoundedCornerShape(100.dp)) // Kenarları yuvarlak
                    .background(Color(0xFF003B52)),


            )

            // Artı Butonu
            Button(
                onClick = { /* Artır */ },
                modifier = Modifier
                    .size(60.dp)
                    .padding(bottom = 20.dp)
            ) {
                Text(text = "+", fontSize = 24.sp, color = Color(0xFFA9E8E8))
            }

            // Eksi Butonu
            Button(
                onClick = { /* Azalt */ },
                modifier = Modifier
                    .size(60.dp)
                    .padding(top = 20.dp)
            ) {
                Text(text = "-", fontSize = 24.sp, color = Color(0xFFA9E8E8))
            }
        }

        // Next Butonu
        Button(
            onClick = { /* İleri */ },
            modifier = Modifier
                .padding(top = 40.dp)
                .size(width = 200.dp, height = 60.dp)
                .clip(RoundedCornerShape(30.dp))
        ) {
            Text(text = "Next", fontSize = 18.sp, color = Color(0xFF003B52), textAlign = TextAlign.Center)
        }
    }
}

@Preview
@Composable
fun WeightScreenPreview() {
    WeightScreen()
}

