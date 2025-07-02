package com.example.app

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import android.os.Bundle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IssueList()
        }
    }
}

@Composable
fun IssueList() {
    Column {
        Text("- Issue 1")
        Text("- Issue 2")
        Text("- Issue 3")
    }
}