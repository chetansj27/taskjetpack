import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.csj.chetans.R
import com.csj.chetans.ui.theme.BlueDesign


@Preview(showBackground = true)

@Composable
fun Signup() {
    var name by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0, 7)))
    }
    var password by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0, 7)))
    }
    var email by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0, 7)))
    }


    Box {
        Surface(color = BlueDesign, modifier = Modifier.fillMaxSize()) {
            /*Image(
                painter = painterResource(id = R.drawable.signup),
                contentDescription = null,
                alignment = Alignment.TopStart
            )*/
        }
        Surface(
            color = Color.White,
            modifier = Modifier
                .height(700.dp)
                .fillMaxWidth()
                .padding(top = 100.dp),
            shape = RoundedCornerShape(60.dp).copy(
                bottomStart = ZeroCornerSize,
                bottomEnd = ZeroCornerSize
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Top,

                ) {
                Image(
                    painter = painterResource(id = R.drawable.signup),
                    contentDescription = null,
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxHeight()
                        .fillMaxWidth()
                )
                Text(buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = BlueDesign,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 26.sp,


                            )
                    ) {
                        append("Create An Account")
                    }
                }, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.padding(top = 5.dp))
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Name") },
                    singleLine = true,
                    leadingIcon = {
                        // In this method we are specifying
                        // our leading icon and its color.
                        Icon(
                            painter = painterResource(id = R.drawable.ic_account),
                            contentDescription = null,


                            )
                    },

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = BlueDesign,
                        focusedBorderColor = BlueDesign,
                        unfocusedBorderColor = Color.Black,
                        focusedLabelColor = BlueDesign,
                        unfocusedLabelColor = Color.Black,
                        cursorColor = BlueDesign,
                        leadingIconColor = BlueDesign


                    ),
                    modifier = Modifier.fillMaxWidth(),


                    )
                Spacer(modifier = Modifier.padding(top = 5.dp))
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    singleLine = true,
                    leadingIcon = {
                        // In this method we are specifying
                        // our leading icon and its color.
                        Icon(
                            painter = painterResource(id = R.drawable.ic_email),
                            contentDescription = null,
                            tint = Color.Black,


                            )
                    },

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = BlueDesign,
                        focusedBorderColor = BlueDesign,
                        unfocusedBorderColor = Color.Black,
                        focusedLabelColor = BlueDesign,
                        unfocusedLabelColor = Color.Black,
                        cursorColor = BlueDesign,


                        ),
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

                )
                Spacer(modifier = Modifier.padding(top = 5.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    singleLine = true,
                    leadingIcon = {
                        // In this method we are specifying
                        // our leading icon and its color.
                        Icon(
                            painter = painterResource(id = R.drawable.ic_password),
                            contentDescription = null,
                            tint = Color.Black,


                            )
                    },
                    trailingIcon = {
                        // In this method we are specifying
                        // our leading icon and its color.
                        Icon(
                            painter = painterResource(id = R.drawable.ic_eye),
                            contentDescription = null,
                            tint = Color.Black,


                            )
                    },

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = BlueDesign,
                        focusedBorderColor = BlueDesign,
                        unfocusedBorderColor = Color.Black,
                        focusedLabelColor = BlueDesign,
                        unfocusedLabelColor = Color.Black,
                        cursorColor = BlueDesign,


                        ),
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword)

                )
                OutlinedButton(
                    onClick = {},
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
                            append("SignUp")
                        }
                    }, modifier = Modifier.padding(2.dp))
                }
                Text(buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black)) {
                        append("Already have an account? ")
                    }


                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = BlueDesign)) {
                        append("Login Here")
                    }

                }, modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

            }
        }


    }
}





