package tes.gojek.orders

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import tes.gojek.component.bottomBar

@Composable
fun ordersMain(navController: NavController,modifier: Modifier = Modifier) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),

        bottomBar = {
            bottomBar(navController)
        }
    ) { contentPadding ->
        Text(text = "ini orders",
            modifier
                .padding(contentPadding))
    }
}