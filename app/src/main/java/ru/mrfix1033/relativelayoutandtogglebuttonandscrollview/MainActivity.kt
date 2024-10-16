package ru.mrfix1033.relativelayoutandtogglebuttonandscrollview

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.appcompat.app.AppCompatActivity
import ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.database.Database
import ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.managers.ButtonClickManager
import ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.managers.ViewsManager
import ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.utils.Utils

class MainActivity : AppCompatActivity() {

    lateinit var utils: Utils
    lateinit var database: Database
    lateinit var viewsManager: ViewsManager private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        utils = Utils()
        database = Database()
        viewsManager = ViewsManager(this)
        ButtonClickManager(this)
    }
}