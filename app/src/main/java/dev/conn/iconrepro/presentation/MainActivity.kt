package dev.conn.iconrepro.presentation

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import dev.conn.iconrepro.presentation.theme.IconReproTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WearApp()
        }
    }
}

@Composable
fun WearApp() {
    val bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)

    val red = Paint()
    red.color = Color.rgb(255, 0, 0)
    canvas.drawRect(0f, 0f, 40f, 40f, red)

    val blue = Paint()
    blue.color = Color.BLUE
    canvas.drawRect(60f, 60f, 100f, 100f, blue)

    IconReproTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Icon(bitmap = bitmap.asImageBitmap(),
                contentDescription = null)
        }
    }
}
