package com.csj.chetans


import android.graphics.Color
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.csj.chetans.design.TaskDetails
import com.csj.chetans.ui.theme.ChetansTheme
import android.util.DisplayMetrics
import com.csj.chetans.design.Calender
import com.csj.chetans.design.Projects
import com.csj.chetans.design.SettingPage
import com.csj.chetans.ui.theme.grey


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val window = this.window
        window.statusBarColor = Color.WHITE
        setContent {
            ChetansTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Projects()
                }
            }
        }
    }
}
