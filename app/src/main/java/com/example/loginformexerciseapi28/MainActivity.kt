package com.example.loginformexerciseapi28

//suggestion from gpt

//import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
//import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.material3.OutlinedTextField as OutlinedTextField1
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginformexerciseapi28.ui.theme.LoginFormExerciseAPI28Theme
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import com.example.loginformexerciseapi28.ui.theme.LoginFormExerciseAPI28Theme
import androidx.compose.material3.Icon as Icon1
import androidx.compose.material3.Icon as Icon2
import androidx.compose.material3.Text as Text1
//import androidx.compose.runtime.ComposableInferredTarget as ComposableInferredTarget1
//import androidx.compose.runtime.ComposableTarget as ComposableTarget1


//suggestion from internet
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginFormExerciseAPI28Theme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text1(
                text = "Login",
                style = MaterialTheme.typography.headlineMedium
            )
            OutlinedTextField1(
                value = username,
                onValueChange = { username = it },
                label = { Text1("Username") },
                trailingIcon = { Icon2(imageVector = Icons.Default.Email, contentDescription = "Email Icon") },
                //leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email Icon") },
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            OutlinedTextField1(
                value = password,
                onValueChange = { password = it },
                label = { Text1("Password") },
                trailingIcon = { Icon2(imageVector = Icons.Default.Lock, contentDescription = null) },
        /*        leadingIcon = {
                    Icon1(
                        //imageVector = Icons.Filled.Lock
                        Icons.Default.Lock,
                        contentDescription ="Lock Icon"
                    )
                              },*/
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            Button(
                onClick = { /* No login logic yet*/ },
                modifier = Modifier
                    .fillMaxWidth(fraction = 0.8f)
                    .padding(16.dp)
            ) {
                Text1("Submit")
            }
        }

    }

    @Composable
    fun LoginExerciseAPI28Theme(content: Unit) {

    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        LoginExerciseAPI28Theme(
            Login()
        )
    }}

