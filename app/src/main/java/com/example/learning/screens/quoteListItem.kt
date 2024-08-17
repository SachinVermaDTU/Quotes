package com.example.learning.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learning.data.quotes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun quoteListItem(qutes:quotes, onClick:(qout:quotes?)->Unit) {
    Card(elevation = CardDefaults.cardElevation(4.dp),
        modifier =  Modifier.padding(8.dp)
            .clickable { onClick(qutes) }
    ) {
    Row(modifier = Modifier.padding(16.dp)){
       Image(imageVector = Icons.Filled.Favorite,
           colorFilter = ColorFilter.tint(Color.White),
           alignment = Alignment.TopStart,
           contentDescription = "Quote"
           , modifier = Modifier
               .size(40.dp)
               .rotate(180f)
               .background(Color.Black))
        Spacer(modifier = Modifier.padding(4.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = qutes.text,
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
            )

            Box(modifier = Modifier
                .background(Color(0xFFEEEEEE))
                .fillMaxWidth(0.4f)
                .height(1.dp)
            )
            Text(text = qutes.author, fontWeight = FontWeight.Light,
                fontSize = 9.sp)
        }
    }
}}

