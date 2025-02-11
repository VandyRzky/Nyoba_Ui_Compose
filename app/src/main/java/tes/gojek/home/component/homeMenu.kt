package tes.gojek.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
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
fun menuButton(modifier: Modifier = Modifier) {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .wrapContentSize(),
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = placeholder
        )) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.image38), contentDescription =null, modifier = Modifier
                .size(70.dp))
            Text(text = "ini text", fontSize = 25.sp, fontWeight = FontWeight.Light)
        }
    }
}

@Preview
@Composable
private fun preview() {
    menuButton()
}