package com.csj.chetans.design


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.csj.chetans.R
import com.csj.chetans.ui.theme.BlueDesign


@Preview(showBackground = true)

@Composable
fun LoginPage1() {

    Box {
        Surface(color = BlueDesign, modifier = Modifier.fillMaxSize()) {

        }
        Surface(
            color = Color.White,
            modifier = Modifier
                .height(600.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(60.dp).copy(
                topEnd = ZeroCornerSize,
                topStart = ZeroCornerSize
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = BlueDesign,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 26.sp,


                            )
                    ) {
                        append("Smart Task Planner")
                    }
                }, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.padding(16.dp))
                Image(painter = painterResource(id = R.drawable.splash), contentDescription = null)
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = BlueDesign),
                    elevation = ButtonDefaults.elevation(10.dp),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(16.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                    Text(buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.White,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 22.sp,
                            )
                        ) {
                            append("LogIn")
                        }
                    }, modifier = Modifier.padding(2.dp))
                }
                OutlinedButton(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    elevation = ButtonDefaults.elevation(10.dp),

                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(16.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp),


                    ) {
                    Text(buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = BlueDesign,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 22.sp,
                            )
                        ) {
                            append("SignUp")
                        }
                    }, modifier = Modifier.padding(2.dp))
                }

            }

        }
    }

}
