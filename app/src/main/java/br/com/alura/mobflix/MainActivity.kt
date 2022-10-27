package br.com.alura.mobflix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.alura.mobflix.ui.layout.HomeScreen
import br.com.alura.mobflix.ui.theme.MobFlixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobFlixTheme {
                HomeScreen()
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    MobFlixTheme {
        HomeScreen()
    }
}