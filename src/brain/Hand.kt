package brain

import java.awt.Robot
import java.awt.event.KeyEvent

open class Hand {
    val robot = Robot()

    fun keyTap(keyCode: Int) {
        robot.keyPress(keyCode)
        robot.keyRelease(keyCode)
    }

    fun keyPress(keyCode: Int){
        robot.keyPress(keyCode)
    }

    fun keyRelease(keyCode: Int){
        robot.keyRelease(keyCode)
    }

    fun pressA() {
        keyTap(keyCode = KeyEvent.VK_Z)
    }

    fun pressB() {
        keyTap(keyCode = KeyEvent.VK_X)
    }

    fun pressUp() {
        keyTap(keyCode = KeyEvent.VK_UP)
    }

    fun pressDown() {
        keyTap(keyCode = KeyEvent.VK_DOWN)
    }

    fun pressLeft() {
        keyTap(keyCode = KeyEvent.VK_LEFT)
    }

    fun pressRight() {
        keyTap(keyCode = KeyEvent.VK_RIGHT)
    }
}