package ovh.plrapps.mapcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ovh.plrapps.mapcompose.ui.MapUI
import ovh.plrapps.mapcompose.viewmodels.CenteringOnMarkerVM

@Composable
fun CenteringOnMarkerDemo(
    modifier: Modifier = Modifier,
    viewModel: CenteringOnMarkerVM,
    onCenter: () -> Unit
) {
    Column(modifier.fillMaxSize()) {
        MapUI(
            modifier.weight(2f),
            state = viewModel.state
        )
        Button(onClick = {
            onCenter()
        }, Modifier.padding(8.dp)) {
            Text(text = "Center on marker")
        }
    }
}