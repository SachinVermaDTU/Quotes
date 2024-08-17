package com.example.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.learning.data.Pages
import com.example.learning.screens.Details
import com.example.learning.screens.listz
import com.example.learning.ui.theme.LearningTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            DataManager.loadAssetsFromFile(applicationContext)
        }

        setContent {
            LearningTheme {
            App()
            }
        }
    }
}

@Composable
fun App(){
    if(DataManager.isLoad){
        if(DataManager.page == Pages.Listing){
         listz(DataManager.data) {
             DataManager.switchPages(it)
         }
        }
       else if(DataManager.page == Pages.Details){
           DataManager.currentPage?.let { Details(qou = it) }
        }
    }
}
