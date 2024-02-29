package com.akashdas.notepad.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.akashdas.notepad.R

val font = FontFamily(
    Font(R.font.nunito, FontWeight.Normal),
    Font(R.font.nunito, FontWeight.Bold),
    Font(R.font.nunito, FontWeight.Light),
    Font(R.font.nunito, FontWeight.Medium)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    titleLarge = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.Medium,
        color = Color.White,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    labelSmall = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)