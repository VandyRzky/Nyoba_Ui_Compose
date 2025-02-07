package tes.gojek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import tes.gojek.chat.chatMain
import tes.gojek.home.homeMain
import tes.gojek.orders.ordersMain
import tes.gojek.promos.promosMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "home"){
                composable("home") { homeMain(navController) }
                composable("order") { ordersMain(navController) }
                composable("promo") { promosMain(navController) }
                composable("chat") { chatMain(navController) }
            }
        }
    }
}
