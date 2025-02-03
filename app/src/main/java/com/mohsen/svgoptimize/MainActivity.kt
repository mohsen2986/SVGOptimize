package com.mohsen.svgoptimize

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.mohsen.svgoptimize.ui.theme.SVGOptimizeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SVGOptimizeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val icons = remember {
        mutableListOf(
            R.drawable.icon,
            R.drawable.icon_2,
            R.drawable.icon_3,
            R.drawable.icon_4,
            R.drawable.icon_5,
            R.drawable.icon_6,
            R.drawable.icon_7,
            R.drawable.icon_8,
            R.drawable.icon_9,
            R.drawable.icon_10,
            R.drawable.icon_11,
            R.drawable.icon_12,
            R.drawable.icon_13,
            R.drawable.icon_14,
            R.drawable.icon_15,
            R.drawable.icon_16,
            R.drawable.icon_17,
            R.drawable.icon_18,
            R.drawable.icon_19,
            R.drawable.icon_20,
            R.drawable.icon_21,
            R.drawable.icon_22,
            R.drawable.icon_23,
            R.drawable.icon_24,
            R.drawable.icon_25,
            R.drawable.icon_26,
            R.drawable.icon_27,
            R.drawable.icon_28,
            R.drawable.icon_29,
            R.drawable.icon_30,
            R.drawable.icon_31,
            R.drawable.icon_32,
            R.drawable.icon_33,
            R.drawable.icon_34,
            R.drawable.icon_35,
            R.drawable.icon_36,
            R.drawable.icon_37,
            R.drawable.icon_38,
            R.drawable.icon_39,
            R.drawable.icon_40,
            R.drawable.icon_41,
            R.drawable.icon_42,
            R.drawable.icon_43,
            R.drawable.icon_44,
            R.drawable.icon_45,
            R.drawable.icon_46,
            R.drawable.icon_47,
            R.drawable.icon_48,
            R.drawable.icon_49,
        )
        116
    }
    LazyColumn {
        items(icons) {
            Icon(painter = painterResource(it), contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SVGOptimizeTheme {
        Greeting()
    }
}