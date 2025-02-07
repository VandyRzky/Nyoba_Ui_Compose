package tes.gojek.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tes.gojek.R
import tes.gojek.ui.theme.goGoGreen
import tes.gojek.ui.theme.placeholder
import tes.gojek.ui.theme.title
import tes.gojek.ui.theme.white

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    Row (
        modifier
            .fillMaxWidth()
            .background(goGoGreen)
            .padding(18.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){
        SearchField()
        Image(painter = painterResource(id = R.drawable.profil), contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(50.dp)
                .border(1.dp, white, CircleShape),
            )
    }
}

@Composable
fun SearchField(modifier: Modifier = Modifier) {
    var input by rememberSaveable {
        mutableStateOf("")
    }
    TextField(value = input,
        onValueChange ={input = it},
        placeholder = {
           SearchPlaceholder()
        },
        shape = RoundedCornerShape(27.7.dp),
        modifier = Modifier
            .width(260.dp)
            .wrapContentHeight(),
        colors = TextFieldDefaults.colors(
            focusedTextColor = title,
            focusedPlaceholderColor = placeholder,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            focusedContainerColor = white,
            unfocusedContainerColor = white,
            cursorColor = placeholder
        )
    )
}

@Composable
fun SearchPlaceholder(modifier: Modifier = Modifier) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
    ){
        Icon(Icons.Filled.Search, contentDescription = null, modifier = Modifier.size(25.dp))
        Text(text = "Find services, food, or places", fontSize = 14.sp,
            maxLines = 1, modifier = Modifier,
        )
    }
}

