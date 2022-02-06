package ru.gb.kotlin.picturenasaoftheday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.kotlin.picturenasaoftheday.ui.main.MainFragment
import ru.gb.kotlin.picturenasaoftheday.ui.main.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNow()
        }
    }
}