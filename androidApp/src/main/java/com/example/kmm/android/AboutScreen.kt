package com.example.kmm.android

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AboutScreen() {
    return Column {
        ToolBar()
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private  fun ToolBar(){
    TopAppBar(title = {Text(color = Color.Red, text = "About Page") })
}
private fun FabBottom(){

}