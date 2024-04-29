import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dicegame.composeapp.generated.resources.Res
import dicegame.composeapp.generated.resources.dice_1
import dicegame.composeapp.generated.resources.dice_2
import dicegame.composeapp.generated.resources.dice_3
import dicegame.composeapp.generated.resources.dice_4
import dicegame.composeapp.generated.resources.dice_5
import dicegame.composeapp.generated.resources.dice_6
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.random.Random

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
fun App() {
    MaterialTheme {
      Column(
      ) {
          var img by remember{mutableStateOf(Res.drawable.dice_1) }
          Text(
              text = " WellCome To Dice Game ",
              fontSize = 16.sp,
              fontWeight = FontWeight.ExtraBold,
              modifier = Modifier
                  .padding(vertical = 80.dp, horizontal = 90.dp)
                  .align(Alignment.CenterHorizontally)
          )
          Image(
              painterResource(img),
              contentDescription = null,
              modifier = Modifier
                  .align(Alignment.CenterHorizontally)
                  .padding(horizontal = 90.dp)
          )
          Button(onClick = ({

              var random = Random.nextInt(6)+1
              when(random) {
                  1 -> img = Res.drawable.dice_1
                  2 -> img = Res.drawable.dice_2
                  3 -> img = Res.drawable.dice_3
                  4 -> img = Res.drawable.dice_4
                  5 -> img = Res.drawable.dice_5
                  6 -> img = Res.drawable.dice_6
              }
          }),
              modifier = Modifier
                  .align(Alignment.CenterHorizontally)
                  .padding(horizontal = 90.dp)
          ){
              Text(text = "Roll dice")
          }

      }
    }
}