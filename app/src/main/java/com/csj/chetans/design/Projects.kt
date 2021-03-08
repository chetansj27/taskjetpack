package com.csj.chetans.design

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
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
import com.csj.chetans.ui.theme.*

@Preview
@Composable
fun Projects() {
    Column(
        modifier = Modifier
            .background(color = grey)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .background(
                    color = Color.White,

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
                            append("Projects")
                        }
                    },
                )
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        tint = Color.Black,

                        modifier = Modifier
                            .padding(top = 6.dp, end = 10.dp)
                            .size(24.dp)

                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .size(24.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(2.dp))
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 3.dp, bottom = 3.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                OutlinedButton(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = BlueDesign),
                    elevation = ButtonDefaults.elevation(10.dp),

                    modifier = Modifier

                        .padding(4.dp),
                    shape = RoundedCornerShape(8.dp),


                    ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.White,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 17.sp,
                                )
                            ) {
                                append("All")
                            }
                        },
                    )
                }
                OutlinedButton(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),


                    modifier = Modifier

                        .padding(4.dp),
                    shape = RoundedCornerShape(8.dp),


                    ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = BlueDesign,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 17.sp,
                                )
                            ) {
                                append("Ongoing")
                            }
                        },
                    )
                }
                OutlinedButton(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),


                    modifier = Modifier

                        .padding(4.dp),
                    shape = RoundedCornerShape(8.dp),


                    ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = BlueDesign,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 17.sp,
                                )
                            ) {
                                append("Completed")
                            }
                        },
                    )
                }


            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, end = 10.dp, start = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 15.dp)
                    )
                    .padding(start = 15.dp, top = 10.dp, bottom = 10.dp, end = 15.dp)
                    .width(130.dp)
            ) {
                CircularProgressIndicator(
                    color = BlueDesign,
                    progress = 0.8f,

                    strokeWidth = 5.dp,


                    )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                            )
                        ) {
                            append("17 Tasks")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.W400
                            )
                        ) {
                            append("Landing Page Wireframe")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))


                Column(
                    modifier = Modifier.background(
                        color = BlueButton,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = BlueDesign,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 13.sp,
                                    shadow = Shadow(color = Color.Red, offset = Offset.Zero)
                                )
                            ) {
                                append("Web")
                            }
                        },
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 10.dp,
                            bottom = 10.dp
                        )
                    )
                }


            }
            Column(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 15.dp)
                    )
                    .padding(start = 15.dp, top = 10.dp, bottom = 10.dp, end = 15.dp)
                    .width(130.dp)
            ) {
                CircularProgressIndicator(
                    color = green,
                    progress = 0.4f,

                    strokeWidth = 5.dp,


                    )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                            )
                        ) {
                            append("10 Tasks")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.W400
                            )
                        ) {
                            append("App Project For Client")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))


                Column(
                    modifier = Modifier.background(
                        color = GreenButton,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = green,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 13.sp,

                                    )
                            ) {
                                append("App")
                            }
                        },
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 10.dp,
                            bottom = 10.dp
                        )
                    )
                }


            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, end = 10.dp, start = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 15.dp)
                    )
                    .padding(start = 15.dp, top = 10.dp, bottom = 10.dp, end = 15.dp)
                    .width(130.dp)
            ) {
                CircularProgressIndicator(
                    color = orange,
                    progress = 0.5f,

                    strokeWidth = 5.dp,


                    )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                            )
                        ) {
                            append("09 Tasks")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.W400
                            )
                        ) {
                            append("Web App Planning")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))


                Column(
                    modifier = Modifier.background(
                        color = OrangeButton,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = orange,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 13.sp,

                                    )
                            ) {
                                append("Web App")
                            }
                        },
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 10.dp,
                            bottom = 10.dp
                        )
                    )
                }


            }
            Column(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 15.dp)
                    )
                    .padding(start = 15.dp, top = 10.dp, bottom = 10.dp, end = 15.dp)
                    .width(130.dp)
            ) {
                CircularProgressIndicator(
                    color = red,
                    progress = 0.1f,

                    strokeWidth = 5.dp,


                    )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                            )
                        ) {
                            append("16 Tasks")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.W400
                            )
                        ) {
                            append("Dashboard UI Design")
                        }
                    },
                )
                Spacer(modifier = Modifier.padding(2.dp))


                Column(
                    modifier = Modifier.background(
                        color = RedButton,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = red,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 13.sp,

                                    )
                            ) {
                                append("Dashboard")
                            }
                        },
                        modifier = Modifier.padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 10.dp,
                            bottom = 10.dp
                        )
                    )
                }


            }

        }
        Spacer(modifier = Modifier.padding(70.dp))
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
                    modifier = Modifier.padding(top = 4.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_copy),
                    contentDescription = null,
                    tint = BlueDesign,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = null,
                    tint = BlueDesign,
                    modifier = Modifier.size(30.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_send),
                    contentDescription = null,
                    tint = Color.Black, modifier = Modifier.padding(top = 4.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_account1),
                    contentDescription = null,
                    tint = Color.Black, modifier = Modifier.padding(top = 4.dp)

                )

            }
        }


    }
}