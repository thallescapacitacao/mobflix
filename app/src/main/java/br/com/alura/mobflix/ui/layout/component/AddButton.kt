package br.com.alura.mobflix.ui.layout.component

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable

@Composable
fun AddButton() {
    FloatingActionButton(
        onClick = {}
    ) {
        Icon(
            Icons.Default.Add,
            contentDescription = null
        )
    }
}