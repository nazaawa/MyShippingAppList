package com.andedi.myshippingapplist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.andedi.myshippingapplist.ui.theme.MyShippingAppListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyShippingAppListTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val  SItem by remember { mutableStateOf(listOf<ShippingItem>()) }

                    Column (
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    )  {
                        AlertDialog(
                            onDismissRequest = { /*TODO*/ },
                            confirmButton = { /*TODO*/ })
                        Button(onClick = {

                        } , modifier= Modifier.align(Alignment.CenterHorizontally)) {
                            Text(text = "Add item")
                        }

                        LazyColumn {

                            items(SItem) { item ->
                                Text(text = item.name)
                            }
                        }

                    }
                }
            }
        }
    }


}



data class  ShippingItem (val id  : Int , val name : String , val quantity : Int , val isEding : Boolean =  false)

