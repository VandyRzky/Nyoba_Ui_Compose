package tes.gojek.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import tes.gojek.component.bottomBar
import tes.gojek.home.component.GopayLayout
import tes.gojek.home.component.SearchBar


@Composable
fun homeMain(navController: NavController) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
    topBar = {
        SearchBar()
    },
        bottomBar = {
            bottomBar(navController)
        }
    ) { contentPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(contentPadding)
                .padding(18.dp)
        ) {item{
            GopayLayout()
        }
        }
    }
}

@Preview
@Composable
private fun preview() {
    homeMain(navController = rememberNavController())
}