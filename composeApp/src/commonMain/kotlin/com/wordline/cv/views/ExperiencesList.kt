import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wordline.cv.models.Experience

@Composable
fun ExperiencesListView(experiences: List<Experience>) {
    Column(modifier = Modifier.padding(top = 8.dp)) {
        experiences.forEach { exp ->
            Text(
                text = "• ${exp.name}",
                fontSize = 18.sp,
                modifier = Modifier.padding(vertical = 2.dp)
            )
            Text(text = exp.content, fontSize = 16.sp, color = Color.Gray)
        }
    }
}