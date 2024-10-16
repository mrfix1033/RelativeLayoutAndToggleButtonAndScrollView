package ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.managers

import ru.mrfix1033.relativelayoutandtogglebuttonandscrollview.MainActivity

class ButtonClickManager(app: MainActivity) {
    init {
        app.run {
            viewsManager.buttonLoad.setOnClickListener {
                viewsManager.tv.text = utils.loadBook(database.text)
                    .joinTo(StringBuilder(), separator = " ").toString()
            }
        }
    }
}