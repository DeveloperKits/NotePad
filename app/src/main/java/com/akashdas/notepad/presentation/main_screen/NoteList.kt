package com.akashdas.notepad.presentation.main_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashdas.notepad.ui.theme.NotePadTheme
import com.akashdas.notepad.ui.theme.card1
import com.akashdas.notepad.ui.theme.dark
import com.akashdas.notepad.ui.theme.darkButton


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NoteList() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(color = dark),

        topBar = {
            TopAppBar(
               /* modifier = Modifier
                    .fillMaxWidth().size(75.dp),*/

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = dark,
                    titleContentColor = Color.White,
                ),

                title = {
                    Text(
                        text = "Notes",
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 45.sp
                    )
                },

                actions = {
                    IconButton(
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .size(50.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(color = darkButton),

                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            tint = Color.White,
                            imageVector = Icons.Outlined.Search,
                            contentDescription = "Search Icon",
                        )
                    }

                    IconButton(
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .size(50.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(color = darkButton),

                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            tint = Color.White,
                            imageVector = Icons.Outlined.Info,
                            contentDescription = "Info Icon",
                        )
                    }
                },
            )
        },

        floatingActionButton = {
            LargeFloatingActionButton(
                shape = CircleShape,

                elevation = FloatingActionButtonDefaults.elevation(
                    defaultElevation = 10.dp
                ),

                containerColor = dark,

                modifier = Modifier.size(70.dp),

                onClick = { /*TODO*/ }
            ) {
                Icon(
                    modifier = Modifier.size(45.dp),
                    imageVector = Icons.Filled.Add,
                    tint = Color.White,
                    contentDescription = "Add")
            }
        }

    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = dark),
        ){
            items(14){
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = card1
                    ),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),

                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 10.dp)
                        .fillMaxWidth()

                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                            .background(card1),
                        color = dark,
                        text = "Hello World",
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 25.sp,
                    )
                }
            }

        }
    }
}