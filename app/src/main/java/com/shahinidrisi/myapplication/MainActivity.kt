package com.shahinidrisi.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shahinidrisi.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.SpanStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    // Welcome Text
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 40.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Welcome To Hayat",
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color(0xFF00CED1),
                            fontSize = 36.sp,
                            textAlign = TextAlign.Center
                        )
                    }

                    // Image
                    Image(
                        painter = painterResource(id = R.drawable.h),
                        contentDescription = "Centered Image",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Hayat is your trusted health companion, delivering quality care and wellness solutions right to your doorstep. Our mission is to make healthcare simple, accessible, and compassionate for everyone.",
                        fontSize = 16.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    )

                    // Spacer to push button down
                    Spacer(modifier = Modifier.weight(1f))

                    // Login Button
                    Button(
                        onClick = { /* Handle login */ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF00CED1),
                            contentColor = Color.White
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 32.dp)
                    ) {
                        Text(text = "Login")
                    }

                    Text(
                        text = buildAnnotatedString {
                            append("Don't have an account? ")
                            withStyle(style = SpanStyle(color = Color(0xFF00CED1))) {
                                append("Signup now")
                            }
                        },
                        fontSize = 14.sp,
                        color = Color.Gray, // Default color for rest
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    )

                }
            }
        }
    }
}
