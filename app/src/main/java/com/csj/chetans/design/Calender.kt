package com.csj.chetans.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.csj.chetans.ui.theme.grey

@Preview
@Composable
fun Calender() {
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

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.Black, modifier = Modifier.padding(top = 2.dp, end = 10.dp)
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
                            append("Calender")
                        }
                    },
                )

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_menu_dot),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .size(24.dp)
                    )
                }
            }


        }
    }
}