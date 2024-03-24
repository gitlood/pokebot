package core

import java.util.concurrent.TimeUnit

fun justWait(seconds: Long = 2) {
    TimeUnit.SECONDS.sleep(seconds)
}

fun justWaitMilliSeconds(milliSeconds: Long = 500) {
    TimeUnit.MILLISECONDS.sleep(milliSeconds)
}