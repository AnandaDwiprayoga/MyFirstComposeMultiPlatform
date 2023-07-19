package com.example.myfirstkmm.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CounterPage(
    modifier: Modifier = Modifier
) {
    var counter by remember {
        mutableStateOf(0)
    }

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Button(
            onClick = {
                counter++
            },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("Add counter $counter")
        }
    }
}
