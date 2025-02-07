package tes.gojek.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tes.gojek.R
import tes.gojek.ui.theme.buckBuckBlue
import tes.gojek.ui.theme.goGoGreen
import tes.gojek.ui.theme.white


@Composable
fun GopayLayout() {
    Row (modifier = Modifier
        .fillMaxWidth()
        .background(buckBuckBlue, shape = RoundedCornerShape(18.dp))
        .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceBetween
    ){
        GopayBox()
        ActionButtonGroup()
    }
}

@Composable
fun GopayBox() {
    Column (modifier = Modifier
        .background(white, shape = RoundedCornerShape(12.dp))
        .padding(6.5.dp)
        .width(90.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ){
        Image(painter = painterResource(id = R.drawable.img), contentDescription = null,
            modifier = Modifier
                .width(53.dp)
                .height(22.dp)
        )
        Text(text = "Rp. 5.310",
            modifier = Modifier,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold)
        Text(text = "Tap to top up",
            color = goGoGreen,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold)
    }
}

@Composable
fun GopayActionButton(icon: ImageVector, text: String) {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .wrapContentSize(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(5.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(2.5.dp),
            modifier = Modifier
                .padding(6.dp)) {
            Icon(imageVector = icon, contentDescription = null,
                tint = buckBuckBlue,
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(white)
                    .padding(3.dp),
            )
            Text(text = text, fontSize = 13.sp, fontWeight = FontWeight.SemiBold, maxLines = 1)
        }
    }
}

@Composable
fun ActionButtonGroup() {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(1.dp),
        modifier = Modifier
            .wrapContentSize()
    ){
        GopayActionButton(icon = Icons.Filled.KeyboardArrowUp, text = "Pay")
        GopayActionButton(icon = Icons.Filled.Add, text = "Top Up")
        GopayActionButton(icon = Icons.Filled.ShoppingCart, text = "Explore")
    }
}

@Preview
@Composable
private fun preview() {
    GopayLayout()
}