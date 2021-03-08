package com.csj.chetans.design

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.csj.chetans.R
import com.csj.chetans.ui.theme.*


@Composable
fun TaskDetails() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()

            .background(color = grey)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(size = 30.dp).copy(
                        topStart = ZeroCornerSize,
                        topEnd = ZeroCornerSize
                    )
                )
                .padding(bottom = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp, top = 15.dp)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W300,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 22.sp,


                                )
                        ) {
                            append("Mar 9,2021")
                        }
                    },
                )

                Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier
                            .padding(start = 15.dp, top = 4.dp)

                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.padding(start = 15.dp, end = 10.dp, top = 4.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))

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
                        append("Today")
                    }
                }, modifier = Modifier.padding(start = 15.dp, end = 15.dp)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            color = BlueDesign,
                            shape = RoundedCornerShape(size = 15.dp)
                        )
                        .padding(10.dp)
                        .width(width = 140.dp)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.ic_exchange),
                        contentDescription = null,
                        modifier = Modifier.padding(start = 100.dp)
                    )


                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight.W600,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 20.sp,


                                    )
                            ) {
                                append("Ongoing")
                            }
                        }, modifier = Modifier.padding(top = 15.dp)
                    )

                }
                Column(
                    modifier = Modifier
                        .background(
                            color = orange,
                            shape = RoundedCornerShape(size = 15.dp)
                        )
                        .padding(10.dp)
                        .width(width = 140.dp)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.ic_clock),
                        contentDescription = null,
                        modifier = Modifier.padding(start = 100.dp)
                    )


                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight.W600,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 20.sp,


                                    )
                            ) {
                                append("In Process")
                            }
                        }, modifier = Modifier.padding(top = 15.dp)
                    )

                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            color = green,
                            shape = RoundedCornerShape(size = 15.dp)
                        )
                        .padding(10.dp)
                        .width(width = 140.dp)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.ic_check),
                        contentDescription = null,
                        modifier = Modifier.padding(start = 100.dp)
                    )


                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight.W600,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 20.sp,


                                    )
                            ) {
                                append("Complete")
                            }
                        }, modifier = Modifier.padding(top = 15.dp)
                    )

                }
                Column(
                    modifier = Modifier
                        .background(
                            color = red,
                            shape = RoundedCornerShape(size = 15.dp)
                        )
                        .padding(10.dp)
                        .width(width = 140.dp)
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.ic_cancel),
                        contentDescription = null,
                        modifier = Modifier.padding(start = 100.dp)
                    )


                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.White,
                                    fontWeight = FontWeight.W600,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 20.sp,


                                    )
                            ) {
                                append("Cancel")
                            }
                        }, modifier = Modifier.padding(top = 15.dp)
                    )

                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 15.dp, end = 15.dp, bottom = 5.dp)
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
                        append("Add Task")
                    }
                },
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_plus),
                contentDescription = null,
                tint = orange, modifier = Modifier.padding(top = 2.dp, start = 8.dp)
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Black,
                                fontWeight = FontWeight.W300,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 20.sp,


                                )
                        ) {
                            append("All Tasks")
                        }
                    },
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_down), contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(top = 4.dp, start = 8.dp)
                )
            }
        }
        Column(
            modifier = Modifier.padding(
                top = 15.dp,
                end = 10.dp,
                start = 10.dp,
                bottom = 2.dp
            )
        ) {
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
                    painter = painterResource(id = R.drawable.ic_check),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                        .padding(top = 5.dp)
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(160.dp)


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
                                append("Dashboard Design")
                            }
                        },
                    )
                    LinearProgressIndicator(
                        color = orange,
                        backgroundColor = grey,
                        progress = 0.3f,
                        modifier = Modifier.height(25.dp)
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {
                    Image(
                        painter = painterResource(id = R.drawable.ic_woman),
                        contentDescription = null,
                        modifier = Modifier

                            .size(40.dp)
                            .clip(shape = CircleShape)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_programmer),
                        contentDescription = null,
                        modifier = Modifier

                            .size(40.dp)
                            .clip(shape = CircleShape)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_next),
                        contentDescription = null,
                        modifier = Modifier


                            .padding(top = 10.dp),
                        tint = Color.Black


                    )
                }

            }
        }
        Column(
            modifier = Modifier.padding(
                top = 15.dp,
                end = 10.dp,
                start = 10.dp,
                bottom = 2.dp
            )
        ) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_check),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                        .padding(top = 5.dp),
                    tint = green

                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(160.dp)


                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 18.sp,
                                    textDecoration = TextDecoration.LineThrough


                                )
                            ) {
                                append("Mobile-app Design")
                            }
                        },
                    )
                    LinearProgressIndicator(
                        color = green,
                        backgroundColor = grey,
                        progress = 1f,
                        modifier = Modifier.height(25.dp)
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {

                    Image(
                        painter = painterResource(id = R.drawable.image),
                        contentDescription = null,
                        modifier = Modifier

                            .size(40.dp)
                            .clip(shape = CircleShape)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_woman),
                        contentDescription = null,
                        modifier = Modifier

                            .size(40.dp)
                            .clip(shape = CircleShape)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_next),
                        contentDescription = null,
                        modifier = Modifier


                            .padding(top = 10.dp),
                        tint = Color.Black


                    )
                }

            }
        }
        Column(
            modifier = Modifier.padding(
                top = 15.dp,
                end = 10.dp,
                start = 10.dp,
                bottom = 2.dp
            )
        ) {
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
                    painter = painterResource(id = R.drawable.ic_check),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(size = 10.dp))
                        .padding(top = 5.dp)
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(160.dp)


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
                                append("Wireframe Design")
                            }
                        },
                    )
                    LinearProgressIndicator(
                        color = red,
                        backgroundColor = grey,
                        progress = 0.8f,
                        modifier = Modifier.height(25.dp)
                    )

                }
                Row(

                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth(),


                    )
                {

                    Image(
                        painter = painterResource(id = R.drawable.ic_man),
                        contentDescription = null,
                        modifier = Modifier

                            .size(40.dp)
                            .clip(shape = CircleShape)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_woman),
                        contentDescription = null,
                        modifier = Modifier

                            .size(40.dp)
                            .clip(shape = CircleShape)
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ic_next),
                        contentDescription = null,
                        modifier = Modifier


                            .padding(top = 10.dp),
                        tint = Color.Black


                    )
                }

            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
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
                    tint = BlueDesign,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_copy),
                    contentDescription = null,
                    tint = Color.Black,
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



