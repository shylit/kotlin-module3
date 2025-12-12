package com.example.ex2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ex2.R

val BitcountPropSingle = FontFamily(
    Font(R.font.bitcountpropsingle_thin, FontWeight.Thin),
    Font(R.font.bitcountpropsingle_regular, FontWeight.Normal),
    Font(R.font.bitcountpropsingle_bold, FontWeight.Bold)
)

val AppTypography = Typography(
    titleMedium = TextStyle(
        fontFamily = BitcountPropSingle,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = BitcountPropSingle,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )
)
