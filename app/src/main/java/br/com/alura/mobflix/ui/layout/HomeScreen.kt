package br.com.alura.mobflix.ui.layout

import android.annotation.SuppressLint
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.alura.mobflix.ui.layout.component.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            Header()
        },
        content = {
            Banner()
            CategoryFilter()
            CardList()
        },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            AddButton()
        }
    )
}