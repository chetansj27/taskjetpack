package com.csj.chetans.design

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.Icon
import androidx.compose.material.Text
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
fun Contact() {
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
                            append("Contacts")
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
        }

        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Chetan")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Android Developer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_man),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Mark")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Co-founder")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_woman),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Daniel")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Designer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_programmer),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Pulkit")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Java Developer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_man),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Akshit")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Frontend Developer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }

        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_programmer),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Prince")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Flutter Developer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_woman),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Angelina")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Content Writer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_man),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Dipesh")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("Network Engineer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }
        Column(modifier = Modifier.padding(top = 15.dp, end = 10.dp, start = 10.dp)) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_programmer),
                    contentDescription = null,
                    modifier = Modifier

                        .size(40.dp)
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(start = 10.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,


                                    )
                            ) {
                                append("Alex")
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
                                    fontSize = 12.sp,


                                    )
                            ) {
                                append("UI Designer")
                            }
                        },
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_conversation),
                        contentDescription = null,
                        tint = BlueDesign,
                        modifier = Modifier.padding(top = 10.dp, end = 8.dp, start = 8.dp)
                    )
                }

            }
        }


    }
}