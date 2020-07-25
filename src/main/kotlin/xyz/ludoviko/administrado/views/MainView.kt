package xyz.ludoviko.administrado.views

import tornadofx.View
import tornadofx.hbox
import tornadofx.label

class MainView : View("Administrado") {
    override val root = hbox {
        label(title)
    }
}