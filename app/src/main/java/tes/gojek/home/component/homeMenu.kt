package tes.gojek.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tes.gojek.R
import tes.gojek.ui.theme.placeholder

@Composable
fun MenuButton(image: Int, text: String) {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .wrapContentSize(),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = placeholder
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = image), contentDescription =null, modifier = Modifier
                .size(65.dp))
            Text(text = text, fontSize = 18.sp, fontWeight = FontWeight.Light)
        }
    }
}

@Composable
fun MenuGroup(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .wrapContentSize()
            .padding(end = 10.dp, start = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            MenuButton(image = R.drawable.image38, text = "GoRide")
            MenuButton(image = R.drawable.image39, text = "GoCar")
            MenuButton(image = R.drawable.image40, text = "GoFood")
            MenuButton(image = R.drawable.image41, text = "GoSend")
        }
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            MenuButton(image = R.drawable.image38, text = "GoMart")
            MenuButton(image = R.drawable.image39, text = "GoTransit")
            MenuButton(image = R.drawable.image40, text = "GoTagihan")
            MenuButton(image = R.drawable.image41, text = "More")
        }

    }
}

@Preview
@Composable
private fun preview() {
    MenuGroup()
}