package pregame

import brain.Hand
import core.justWait
import java.awt.Desktop
import java.awt.event.KeyEvent
import java.io.File

class OpenPokemon : Hand() {

    init {
        openEmulator()
        justWait(4)
        expandEmulator()
        speedUpEmulator()
        loadRom()
    }

    private fun openEmulator() {
        try {
            val file = File("C:\\Users\\TheLood\\VisualBoyAdvance.exe")
            if (!Desktop.isDesktopSupported()) {
                println("Desktop Support Not Present in the system.")
                return
            }
            val desktop = Desktop.getDesktop()
            if (file.exists())
                desktop.open(file)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun loadRom() {
        keyTap(KeyEvent.VK_ALT)
        keyTap(KeyEvent.VK_F)
        keyTap(KeyEvent.VK_O)
        justWait()
        keyTap(KeyEvent.VK_R)
        justWait()
        keyTap(KeyEvent.VK_DOWN)
        keyTap(KeyEvent.VK_ENTER)
    }

    private fun speedUpEmulator(){
        keyPress(KeyEvent.VK_CONTROL)
        keyPress(KeyEvent.VK_SHIFT)
        keyPress(KeyEvent.VK_T)
        keyRelease(KeyEvent.VK_CONTROL)
        keyRelease(KeyEvent.VK_SHIFT)
        keyRelease(KeyEvent.VK_T)
    }

    private fun expandEmulator() {
        keyTap(KeyEvent.VK_ALT)
        keyTap(KeyEvent.VK_O)
        keyTap(KeyEvent.VK_V)
        keyTap(KeyEvent.VK_4)
    }
}