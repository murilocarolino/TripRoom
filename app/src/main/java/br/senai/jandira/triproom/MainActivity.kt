package br.senai.jandira.triproom

import android.bluetooth.BluetoothA2dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.jandira.triproom.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        modifier = Modifier.height(800.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            horizontalArrangement = Arrangement.End
        )
        {
            Box (
                modifier = Modifier
                    .height(50.dp)
                    .background(
                        Color(0xFFCF06F0),
                        shape = RoundedCornerShape(bottomStart = 30.dp)
                    )
                    .width(150.dp),
            ){

            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            Text(
                modifier = Modifier.padding(start = 30.dp),
                text = "Login",
                color = Color(0xFFCF06F0),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.padding(start = 30.dp),
                text = "Please sign in to continue.",
                color = Color(0xFFA09C9C)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "teste@gmail.com",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "E-mail")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "*******",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "Password")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }
        )
        Spacer(modifier = Modifier.height(30.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(Color(0xFFCF06F0)),
            modifier = Modifier
                .height(48.dp)
                .width(134.dp)
                .align(Alignment.End)
                .padding(end = 20.dp),
            shape = RoundedCornerShape(15.dp),
        ) {
            Text(
                text = "SIGN IN",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(
                    id = R.drawable.seta,
                ),
                contentDescription = "Icone seta",
                modifier = Modifier.padding(start = 5.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                modifier = Modifier,
                text = "Don’t have an account?  ",
                color = Color(0xFFA09C9C)
            )
            Text(
                modifier = Modifier.padding(end = 25.dp),
                text = "Sign up",
                color = Color(0xFFCF06F0),
                fontWeight = FontWeight.Bold
            )
        }
        Box (
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .offset(y = 75.dp)
                .background(
                    Color(0xFFCF06F0),
                    shape = RoundedCornerShape(topEnd = 30.dp)
                )
                .padding(top = 90.dp)
        ){

        }
    }
}

@Composable
fun Greeting2() {
    Column (
        modifier = Modifier.height(800.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            horizontalArrangement = Arrangement.End
        )
        {
            Box (
                modifier = Modifier
                    .height(50.dp)
                    .background(
                        Color(0xFFCF06F0),
                        shape = RoundedCornerShape(bottomStart = 30.dp),
                    )
                    .width(150.dp),
            ){

            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign Up",
                color = Color(0xFFCF06F0),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Create a new account",
                color = Color(0xFFA09C9C)
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Card (
            modifier = Modifier
                .size(height = 100.dp, width = 100.dp)
                .align(alignment = Alignment.CenterHorizontally),
            elevation = CardDefaults.cardElevation(10.dp),
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.Magenta),
        ) {
            Icon(
                modifier = Modifier
                    .fillMaxSize(),
                imageVector = Icons.Filled.Person,
                contentDescription = "",
                tint = Color(0xFFCF06F0)
            )
        }
        Image(
            painter = painterResource(
                id = R.drawable.foto,
            ),
            contentDescription = "Icone de foto",
            modifier = Modifier
                .padding(start = 230.dp)
                .offset(y = -30.dp)
                .size(25.dp)
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "Susanna Hoffs",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "Username")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "99999-0987",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "Phone")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "teste@gmail.com",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "E-mail")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            value = "*******",
            onValueChange = {},
            shape = RoundedCornerShape(15.dp),
            label = {
                Text(text = "Password")
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "",
                    tint = Color(0xFFCF06F0)
                )
            }
        )
        Spacer(modifier = Modifier.height(13.dp))
        Row(
            modifier = Modifier
                .padding(start = 24.dp, end = 24.dp)
                .align(Alignment.Start)
        ) {
            Row (
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .border(
                        width = 2.dp, color = Color(0xffCF06F0)
                    )
            ){}
            Text(
                text = "Over 18?",
                modifier = Modifier.padding(top = 8.dp, start = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(13.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults
                .buttonColors(Color(0xFFCF06F0)),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(start = 20.dp)
                .padding(end = 20.dp),
            shape = RoundedCornerShape(15.dp),
        ) {
            Text(
                text = "CREATE ACCOUNT",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                modifier = Modifier,
                text = "Already have an account?  ",
                color = Color(0xFFA09C9C),
            )
            Text(
                modifier = Modifier.padding(end = 25.dp),
                text = "Sign up",
                color = Color(0xFFCF06F0),
                fontWeight = FontWeight.Bold
            )
        }
        Box (
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
                .offset(y = 20.dp)
                .background(
                    Color(0xFFCF06F0),
                    shape = RoundedCornerShape(topEnd = 30.dp)
                )
                .padding(top = 90.dp)
        ){

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TripRoomTheme {
        Greeting()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    TripRoomTheme {
        Greeting2()
    }
}