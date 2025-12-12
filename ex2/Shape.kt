package com.example.ex2.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val AppShapes = Shapes(

    small = RoundedCornerShape(
        topStart = 6.dp,
        topEnd = 6.dp,
        bottomStart = 6.dp,
        bottomEnd = 6.dp
    ),

    medium = RoundedCornerShape(
        topStart = 20.dp,
        topEnd = 4.dp,
        bottomStart = 4.dp,
        bottomEnd = 20.dp
    ),

    large = RoundedCornerShape(
        topStart = 32.dp,
        topEnd = 32.dp,
        bottomStart = 12.dp,
        bottomEnd = 12.dp
    )
)
