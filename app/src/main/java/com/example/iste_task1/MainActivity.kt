package com.example.iste_task1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iste_task1.ui.theme.ISTE_task1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ISTE_task1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (modifier = Modifier.padding(innerPadding)) {
                        topbar()
                        inputkumar()
                        displaycards()
                    }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ISTE_task1Theme {
        Greeting("Android")
    }
}


@Composable
fun inputkumar(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)) {
        val textState = remember { mutableStateOf("") }
        OutlinedTextField(
            value = textState.value, // Current value of the text field

            onValueChange = { newText -> textState.value = newText }, // Update state when text changes
            label = { Text("Enter your Task") }, // Label for the text field
            placeholder = { Text("Enter your Task") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),// Fill the available width
        )
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp, top = 0.dp)) {
            Text(text = "Add Task")
        }

    }
}

@Composable
fun topbar(){
    Card(modifier = Modifier
        .fillMaxWidth()

    ){
        Text(text = "TaskyKumar", modifier = Modifier.padding(24.dp), fontSize = 28.sp)
    }
}
@Composable
fun cardkumar(task : String){
    Card (modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)){
        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = task, modifier = Modifier.padding(16.dp)
                . fillMaxWidth(0.85F))
            Icon(imageVector = Icons.Default.Check, contentDescription = "cross icon", modifier = Modifier.padding(16.dp)
            )
        }

    }

}


@Composable
fun displaycards(){
    Column {
        Text(text = "Tasks To Complete:", modifier = Modifier.padding(12.dp), fontSize = 24.sp)
        cardkumar("Lorem Ipsum")
        cardkumar("Lorem Ipsum")
        cardkumar("Lorem Ipsum")
    }


}