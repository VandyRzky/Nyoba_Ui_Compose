package tes.gojek.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import tes.gojek.ui.theme.placeholder
import tes.gojek.ui.theme.white

@Composable
fun bottomBar(navController: NavController,modifier: Modifier = Modifier) {
    Row (
        modifier
            .fillMaxWidth()
            .background(white),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        button(icon = Icons.Filled.Home, text = "Home", navController = navController, navigate = "home")
        button(icon = Icons.Filled.Info, text = "Promos", navController = navController, navigate = "promo")
        button(icon = Icons.Filled.ShoppingCart, text = "Orders",navController = navController, navigate = "order")
        button(icon = Icons.Filled.Email, text = "Chat",navController = navController, navigate = "chat")
    }
}

@Composable
fun button(modifier: Modifier = Modifier, icon: ImageVector, text: String,
           navController: NavController, navigate:String) {
    Button(onClick = { navController.navigate(navigate) },
        colors = ButtonDefaults.buttonColors(
            contentColor = placeholder,
            containerColor = white
        ),
        shape = RectangleShape
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(imageVector = icon, contentDescription = null, modifier.size(18.8.dp))
            Text(text = text, fontSize = 14.sp)
        }
    }
}
