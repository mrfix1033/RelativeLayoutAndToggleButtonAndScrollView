package ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.managers

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.R

class ViewsManager(app: AppCompatActivity) {
    val buttonLoad: Button
    val tv: TextView

    init {
        app.run {
            buttonLoad = findViewById(R.id.buttonLoad)
            tv = findViewById(R.id.tv)
        }
    }
}