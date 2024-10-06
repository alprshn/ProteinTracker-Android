package com.example.proteintracker_android.protein_tracker.presentation.weight_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor

@Composable
fun WeightScreen() {
    var weightName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF05445E)) // Arka plan rengi
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
                .width(270.dp)
                .height(320.dp)
                .border(
                    BorderStroke(3.dp, Color(0xFF0189AB4)),
                    shape = RoundedCornerShape(20.dp)
                )
                .background(Color(0xFF05445E)),
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            ) {
                BasicTextField(
                    value = weightName,
                    onValueChange = { weightName = it },
                    textStyle = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 36.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White, // Light gray for the text
                        textAlign = TextAlign.Center,
                    ),
                    cursorBrush = SolidColor(Color.White),
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                )

                // Placeholder
                if (weightName.isEmpty()) {
                    Text(
                        text = "...",
                        fontSize = 36.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray, // Light gray for the placeholder
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                            .background(Color(0xFF05445E))
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .background(Color(0xFF05445E)),
                contentAlignment = Alignment.Center,

                ) {
                Text("+", fontSize = 36.sp)
            }

            Box(modifier = Modifier.fillMaxWidth()) {
                Spacer(
                    modifier = Modifier
                        .height(3.dp).padding(vertical = 10.dp)
                        .background(Color(0xFFFFFFFF))
                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF05445E))
            ) {
                Text("-", fontSize = 45.sp)
            }

        }

        Box(modifier = Modifier.padding(20.dp)) {
            Button(
                onClick = { /* İleri */ },
                modifier = Modifier
                    .clip(RoundedCornerShape(30.dp))
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(Color(0xff075E6DA)),
            ) {
                Text(
                    text = "Next",
                    fontSize = 18.sp,
                    color = Color(0xFF003B52),
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}

@Preview
@Composable
fun WeightScreenPreview() {
    WeightScreen()
}

