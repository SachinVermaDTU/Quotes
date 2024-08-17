package com.example.learning.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.learning.data.quotes

@Composable
fun listz(data: Array<quotes>, onClick:(qout:quotes?) ->Unit){
  LazyColumn(content = {
      items(data){
          quoteListItem(qutes = it,onClick)
      }
  })
}