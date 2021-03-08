package com.csj.chetans.design


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.csj.chetans.R
import com.csj.chetans.ui.theme.BlueDesign
import com.csj.chetans.ui.theme.grey


@Preview
@Composable
fun Profile() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = grey),

        ) {
        Column(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(size = 50.dp).copy(
                        topEnd = ZeroCornerSize,
                        topStart = ZeroCornerSize
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(start = 15.dp, top = 10.dp, bottom = 5.dp, end = 10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W600,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 24.sp,


                                )
                        ) {
                            append("Profile")
                        }
                    },
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = null,
                    tint = Color.Black,

                    modifier = Modifier
                        .padding(top = 5.dp, start = 160.dp)
                        .size(24.dp)

                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_menu),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .size(24.dp)
                )
            }

            Column(modifier = Modifier.background(color = Color.White)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(end = 10.dp)


                    ) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W600,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 20.sp,


                                        )
                                ) {
                                    append("125")
                                }
                            },
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W500,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 14.sp,


                                        )
                                ) {
                                    append("Tasks Completed")
                                }
                            },
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.image),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(shape = CircleShape)

                            .size(100.dp)

                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start = 10.dp)


                    ) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W600,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 20.sp,


                                        )
                                ) {
                                    append("12")
                                }
                            },
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color.Black,
                                        fontWeight = FontWeight.W500,
                                        fontFamily = FontFamily.SansSerif,
                                        fontSize = 14.sp,


                                        )
                                ) {
                                    append("Tasks Pending")
                                }
                            },
                        )
                    }

                }
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 10.dp)


            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W600,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 20.sp,


                                )
                        ) {
                            append("Chetan Sharma")
                        }
                    },
                )
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W500,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 14.sp,


                                )
                        ) {
                            append("Android Developer")
                        }
                    },
                )
            }

            OutlinedButton(
                onClick = {},
                colors = ButtonDefaults.buttonColors(backgroundColor = BlueDesign),
                elevation = ButtonDefaults.elevation(6.dp),

                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 16.dp),

                shape = RoundedCornerShape(10.dp),


                ) {
                Text(buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.White,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 18.sp,
                        )
                    ) {
                        append("Edit Profile")
                    }
                }, modifier = Modifier.padding(2.dp))
            }
            Spacer(modifier = Modifier.padding(10.dp))


        }
        Column(
            modifier = Modifier
                .background(
                    color = grey,

                    )
                .padding(start = 20.dp, top = 10.dp, end = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif,

                        fontSize = 22.sp,
                        fontWeight = FontWeight.W500
                    )
                ) {
                    append("Explore")
                }
            })
            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .padding(top = 19.dp, bottom = 19.dp, start = 16.dp, end = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_group),
                        contentDescription = null,
                        tint = BlueDesign

                    )
                    Text(buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = BlueDesign,
                                fontFamily = FontFamily.SansSerif,

                                fontSize = 16.sp,

                                )
                        ) {
                            append("Members")
                        }
                    })

                }
                Column(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .padding(top = 19.dp, bottom = 19.dp, start = 26.dp, end = 26.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_crown),
                        contentDescription = null,
                        tint = BlueDesign

                    )
                    Text(buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = BlueDesign,
                                fontFamily = FontFamily.SansSerif,

                                fontSize = 16.sp,

                                )
                        ) {
                            append("GoPro")
                        }
                    })

                }
                Column(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .padding(top = 19.dp, bottom = 19.dp, start = 24.dp, end = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_pie_chart),
                        contentDescription = null,
                        tint = BlueDesign

                    )
                    Text(buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = BlueDesign,
                                fontFamily = FontFamily.SansSerif,

                                fontSize = 16.sp,

                                )
                        ) {
                            append("Report")
                        }
                    })

                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,

                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .padding(top = 19.dp, bottom = 19.dp, start = 16.dp, end = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_settings),
                        contentDescription = null,
                        tint = BlueDesign

                    )
                    Text(buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = BlueDesign,
                                fontFamily = FontFamily.SansSerif,

                                fontSize = 16.sp,

                                )
                        ) {
                            append("Settings")
                        }
                    })

                }
                Column(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = 20.dp)
                        )
                        .padding(top = 19.dp, bottom = 19.dp, start = 16.dp, end = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_logout),
                        contentDescription = null,
                        tint = BlueDesign

                    )
                    Text(buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = BlueDesign,
                                fontFamily = FontFamily.SansSerif,

                                fontSize = 16.sp,

                                )
                        ) {
                            append("Log Out")
                        }
                    })

                }

            }

        }
        Spacer(modifier = Modifier.padding(42.dp))
        Column(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(size = 25.dp).copy(
                        bottomEnd = ZeroCornerSize,
                        bottomStart = ZeroCornerSize
                    )
                )

                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 15.dp, end = 15.dp),
            verticalArrangement = Arrangement.Center

        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_setting_lines),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(top = 9.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_copy),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(top = 9.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = null,
                    tint = BlueDesign,
                    modifier = Modifier.size(36.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_send),
                    contentDescription = null,
                    tint = Color.Black, modifier = Modifier.padding(top = 9.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_account1),
                    contentDescription = null,
                    tint = Color.Black, modifier = Modifier.padding(top = 9.dp)

                )

            }
        }


    }

}
