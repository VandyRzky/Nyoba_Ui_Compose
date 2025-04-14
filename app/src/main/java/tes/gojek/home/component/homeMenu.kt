package tes.gojek.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
            MenuColumn(image1 = R.drawable.image38, text1 = "GoRide", image2 = R.drawable.image42, text2 = "GoMart")
            MenuColumn(image1 = R.drawable.image38, text1 = "GoRide", image2 = R.drawable.image42, text2 = "GoMart")
            MenuColumn(image1 = R.drawable.image38, text1 = "GoRide", image2 = R.drawable.image42, text2 = "GoMart")
            MenuColumn(image1 = R.drawable.image38, text1 = "GoRide", image2 = R.drawable.image42, text2 = "GoMart")

        }

    }
}

@Composable
fun MenuColumn(modifier: Modifier = Modifier, image1: Int, text1: String, image2: Int, text2: String) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(5.dp)
    ){
        MenuButton(image = image1, text = text1)
        Spacer(modifier = Modifier.size(5.dp))
        MenuButton(image = image2, text = text2)
    }
}

@Preview
@Composable
private fun preview() {
    MenuGroup()
}