package com.example.learning.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.learning.DataManager
import com.example.learning.data.quotes


@Composable
fun Details(qou: quotes) {
    BackHandler {
        DataManager.switchPages(null)
    }
    Box(contentAlignment = Alignment.Center,
        modifier= Modifier
            .fillMaxSize()
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFFFFFFF),
                        Color(0xFFE3E3E3)
                    )
                )
            )
        ){
       Card(elevation = CardDefaults.cardElevation(4.dp)){
           Column(verticalArrangement = Arrangement.Center,
               modifier =  Modifier.padding(16.dp , 24.dp)){
           Image(imageVector = Icons.Filled.Home, contentDescription ="dull Image",
              modifier = Modifier.size(80.dp) )
           Text(text = "qou.text" , fontFamily = FontFamily.Cursive
           , modifier = Modifier.fillMaxWidth())
               Spacer(modifier = Modifier.padding(4.dp))
               Text("qou.author")
           }
       }
    }
}