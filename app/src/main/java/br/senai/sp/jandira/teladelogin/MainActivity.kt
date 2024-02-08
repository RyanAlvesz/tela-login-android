package br.senai.sp.jandira.teladelogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.teladelogin.ui.theme.TelaDeLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaDeLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Login() {

    Surface (
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Já tem uma conta?",
                color = Color(0xFFCF9E76),
                fontSize = 20.sp
            )
            Box (
                modifier = Modifier
                    .background(
                        Color(0x869AB7CA),
                        shape = RoundedCornerShape(
                            8.dp
                        )
                    )
                    .padding(
                        vertical = 32.dp
                    )
            ) {
                Column  (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "LOGIN",
                        color = Color(0xff5B86AE),
                        fontSize = 44.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(
                                bottom = 18.dp
                            )
                    )
                    Column (
                    ) {
                        Text(
                            text = "E-mail",
                            modifier = Modifier
                                .padding(
                                    bottom = 6.dp
                                )
                        )
                        TextField(
                            value = "",
                            onValueChange = {},
                            modifier = Modifier
                                .padding(
                                    bottom = 8.dp
                                ),
                            shape = RoundedCornerShape(5.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "Senha",
                            modifier = Modifier
                                .padding(
                                    bottom = 6.dp
                                )
                        )
                        TextField(
                            value = "", onValueChange = {},
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                            shape = RoundedCornerShape(5.dp)
                        )
                    }
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                end = 32.dp
                            ),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = true, onCheckedChange = {},
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xff5B85A5)
                            )
                        )
                        Text(text = "Lembrar")
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xff5B85A5)
                        ),
                        shape = RoundedCornerShape(
                            8.dp
                        ),
                        modifier = Modifier
                            .padding(
                                top = 8.dp
                            )
                            .height(50.dp)
                            .width(150.dp)
                        ) {
                        Text(
                            text = "Entrar",
                            fontSize = 18.sp
                        )
                    }
                }
            }
            Row {
                Text(
                    text = "Desenvolvido por",
                    modifier = Modifier.
                        padding(
                            end = 4.dp
                        )
                )
                Text(
                    text = "Ryan Alves",
                    color = Color(0xFFCF9E76),
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }

}

@Preview (showSystemUi = true)
@Composable
fun LoginPreview() {
    TelaDeLoginTheme {
        Login()
    }
}

@Composable
fun Polaroid() {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(600.dp),
        color = Color(0xFF000000)
    ) {
        Box(
            modifier = Modifier
                .padding(bottom = 120.dp, top = 30.dp, start = 10.dp, end = 10.dp)
                .background(color = Color(0xFFA8E0F1))
        ) {
            Column (
                modifier = Modifier
                    .padding(50.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(
                            topEnd = 16.dp,
                            bottomStart = 16.dp
                        )
                    )
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Text(
                    text = "Fearless",
                )
                Text(
                    text = "1989"
                )
                Text(
                    text = "Folklore"
                )
                Text(
                    text = "Midnights"
                )
                Text(
                    text = "The Tortured Poets Departament"
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PolaroidPreview() {
    Polaroid()
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Xauu")
        }
        Row {
            Checkbox(
                checked = true,
                onCheckedChange = {}
            )
            Text(text = "Marca ai pô")
        }
        Text(text = "Não acredite no de cima")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TelaDeLoginTheme {
        Greeting("Android")
    }
}