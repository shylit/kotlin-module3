package com.example.kotlin_3module

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlin_3module.ui.theme.Kotlin_3moduleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardListScreen()
        }
    }
}

/* ---------- DATA CLASS ---------- */

data class ListCardItem(
    val title: String,
    val description: String,
    val imageResId: Int
)

/* ---------- DATA ---------- */

val cardItems = listOf(
    ListCardItem(
        title = "Кофейня рядом",
        description = "Уютное место с десертами и капучино.",
        imageResId = R.drawable.photo1
    ),
    ListCardItem(
        title = "Парк для прогулок",
        description = "Тихие аллеи и свежий воздух.",
        imageResId = R.drawable.photo2
    ),
    ListCardItem(
        title = "Музей искусства",
        description = "Современные выставки и инсталляции.",
        imageResId = R.drawable.photo3
    ),
    ListCardItem(
        title = "Набережная",
        description = "Прогулочная зона с видом на реку и закат.",
        imageResId = R.drawable.photo1
    ),
    ListCardItem(
        title = "Кинотеатр",
        description = "Современный кинотеатр с большими экранами.",
        imageResId = R.drawable.photo2
    ),
    ListCardItem(
        title = "Торговый центр",
        description = "Магазины, рестораны и развлекательные зоны.",
        imageResId = R.drawable.photo3
    ),
    ListCardItem(
        title = "Спортивный комплекс",
        description = "Залы для тренировок и бассейн.",
        imageResId = R.drawable.photo1
    ),
    ListCardItem(
        title = "Библиотека",
        description = "Тихое место для учёбы и чтения.",
        imageResId = R.drawable.photo2
    ),
    ListCardItem(
        title = "Выставочный зал",
        description = "Регулярные выставки художников и фотографов.",
        imageResId = R.drawable.photo3
    ),
    ListCardItem(
        title = "Ресторан национальной кухни",
        description = "Блюда традиционной кухни в уютной атмосфере.",
        imageResId = R.drawable.photo1
    ),
    ListCardItem(
        title = "Детский развлекательный центр",
        description = "Игровые зоны и аттракционы для детей.",
        imageResId = R.drawable.photo2
    ),
    ListCardItem(
        title = "Смотровая площадка",
        description = "Панорамный вид на город с высоты.",
        imageResId = R.drawable.photo3
    ),
    ListCardItem(
        title = "Фитнес-клуб",
        description = "Тренажёрный зал и групповые занятия.",
        imageResId = R.drawable.photo1
    ),
    ListCardItem(
        title = "Книжный магазин",
        description = "Большой выбор художественной и учебной литературы.",
        imageResId = R.drawable.photo2
    ),
    ListCardItem(
        title = "Арт-пространство",
        description = "Лекции, мастер-классы и культурные события.",
        imageResId = R.drawable.photo3
    ),
    ListCardItem(
        title = "Зоопарк",
        description = "Место для семейного отдыха и прогулок.",
        imageResId = R.drawable.photo1
    ),
    ListCardItem(
        title = "Площадь города",
        description = "Центральное место проведения мероприятий.",
        imageResId = R.drawable.photo2
    ),
    ListCardItem(
        title = "Антикафе",
        description = "Оплата за время, свободная атмосфера.",
        imageResId = R.drawable.photo3
    ),
    ListCardItem(
        title = "Стадион",
        description = "Спортивные матчи и концерты.",
        imageResId = R.drawable.photo1
    ),
    ListCardItem(
        title = "Музыкальная школа",
        description = "Обучение игре на музыкальных инструментах.",
        imageResId = R.drawable.photo2
    )
)

/* ---------- SCREEN ---------- */

@Composable
fun CardListScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 12.dp)
    ) {
        items(cardItems) { item ->
            ListCard(item)
        }
    }
}

/* ---------- CARD ---------- */

@Composable
fun ListCard(item: ListCardItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = item.imageResId),
                contentDescription = item.title,
                modifier = Modifier
                    .size(size = 90.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    text = item.title,
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = item.description,
                )
            }
        }
    }
}
