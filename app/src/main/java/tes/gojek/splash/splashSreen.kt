package tes.gojek.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import tes.gojek.R
import tes.gojek.ui.theme.goGoGreen
import tes.gojek.ui.theme.white


@Composable
fun SplashScreen(navController: NavController) {

    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate("home"){
            popUpTo("splash"){inclusive = true}
        }
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(white)
        .padding(top = 40.dp, bottom = 40.dp),
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.splashlogo),
                contentDescription = null,
                modifier = Modifier
                    .size(220.dp)
            )
        }
        Column (
            modifier = Modifier
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "from", fontSize = 14.sp)
            Text(text = "goto", fontSize = 26.sp,
                fontWeight = FontWeight.Bold, color = goGoGreen)
        }
    }
}
