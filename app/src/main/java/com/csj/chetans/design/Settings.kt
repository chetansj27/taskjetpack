package com.csj.chetans.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.csj.chetans.ui.theme.grey
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.csj.chetans.R
import com.csj.chetans.ui.theme.BlueDesign

@Preview
@Composable
fun SettingPage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = grey),
    ) {
        Column(modifier = Modifier.background(color = Color.White)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, top = 10.dp, bottom = 5.dp, end = 10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.Black, modifier = Modifier.padding(top = 3.dp, end = 10.dp)
                )
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W600,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 22.sp,


                                )
                        ) {
                            append("Settings")
                        }
                    },
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()

                .padding(top = 15.dp, start = 10.dp, end = 10.dp)
                .clip(shape = RoundedCornerShape(size = 15.dp))
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 10.dp, end = 10.dp)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W400,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 16.sp,


                                )
                        ) {
                            append("CUSTOMIZE")
                        }
                    },
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp)
                ) {
                    Column(modifier = Modifier.background(color = grey, shape = CircleShape)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_key),
                            contentDescription = null,
                            tint = BlueDesign,
                            modifier = Modifier.padding(9.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(start = 15.dp)) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W400,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 17.sp,


                                        )
                                ) {
                                    append("Reset Password")
                                }
                            },
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W300,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 13.sp,


                                        )
                                ) {
                                    append("Change Password, Reset Password")
                                }
                            },
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_next),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp)
                ) {
                    Column(modifier = Modifier.background(color = grey, shape = CircleShape)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_paintbrush),
                            contentDescription = null,
                            tint = BlueDesign,
                            modifier = Modifier.padding(9.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(start = 15.dp)) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W400,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 17.sp,


                                        )
                                ) {
                                    append("Appearance")
                                }
                            },
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W300,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 13.sp,


                                        )
                                ) {
                                    append("Change Theme and Fonts")
                                }
                            },
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_next),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp)
                ) {
                    Column(modifier = Modifier.background(color = grey, shape = CircleShape)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_calendar),
                            contentDescription = null,
                            tint = BlueDesign,
                            modifier = Modifier.padding(9.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(start = 15.dp)) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W400,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 17.sp,


                                        )
                                ) {
                                    append("Reminder Settings")
                                }
                            },
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W300,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 13.sp,


                                        )
                                ) {
                                    append("Customize reminder and calender")
                                }
                            },
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_next),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp)
                ) {
                    Column(modifier = Modifier.background(color = grey, shape = CircleShape)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_font),
                            contentDescription = null,
                            tint = BlueDesign,
                            modifier = Modifier.padding(9.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(start = 15.dp)) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W400,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 17.sp,


                                        )
                                ) {
                                    append("Language")
                                }
                            },
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W300,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 13.sp,


                                        )
                                ) {
                                    append("Set your language")
                                }
                            },
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_next),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }

                }

            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()

                .padding(top = 25.dp, start = 10.dp, end = 10.dp)
                .clip(shape = RoundedCornerShape(size = 15.dp)),
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 10.dp, end = 10.dp),

                ) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W400,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 16.sp,


                                )
                        ) {
                            append("HELP")
                        }
                    },
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp)
                ) {
                    Column(modifier = Modifier.background(color = grey, shape = CircleShape)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_key),
                            contentDescription = null,
                            tint = BlueDesign,
                            modifier = Modifier.padding(9.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(start = 15.dp, top = 7.dp)) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W400,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 17.sp,


                                        )
                                ) {
                                    append("Terms & Conditions")
                                }
                            },
                        )

                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_next),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp)
                ) {
                    Column(modifier = Modifier.background(color = grey, shape = CircleShape)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_paintbrush),
                            contentDescription = null,
                            tint = BlueDesign,
                            modifier = Modifier.padding(9.dp)
                        )
                    }
                    Column(modifier = Modifier.padding(start = 15.dp, top = 7.dp)) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W400,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 17.sp,


                                        )
                                ) {
                                    append("Privacy Policy")
                                }
                            },
                        )

                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_next),
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                    }

                }


            }
            
        }
    }
}