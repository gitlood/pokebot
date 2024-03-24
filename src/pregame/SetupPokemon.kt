package pregame

import brain.Hand
import core.justWait
import core.justWaitMilliSeconds
import java.awt.event.KeyEvent

class SetupPokemon : Hand() {
    init {
        openingCredits()
    }

    private fun openingCredits() {
        keyPress(KeyEvent.VK_SPACE)
        justWaitMilliSeconds()
        pressA()
        justWait(1)
        pressA()
        justWait(1)
        val professorsOaksFirstWords = 18
        repeat(professorsOaksFirstWords) {
            pressA()
            justWaitMilliSeconds()
        }

        //new name

        keyRelease(KeyEvent.VK_SPACE)
    }
}