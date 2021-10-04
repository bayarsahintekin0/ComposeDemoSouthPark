package com.bayarsahintekin.composedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.bayarsahintekin.composedemo.ui.theme.AppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                appDesign()
            }
        

        }
    }

    @Composable
    fun appDesign() {
        Scaffold(
            content = {
                HomeList()
            }
        )
    }
}