fun main() {
    val onlineStatus = 172_800
    print("Был в сети ")
    when (onlineStatus) {
        in 0..60 -> println("только что")
        in 61..60 * 60 -> minutesDeclination(onlineStatus)
        in 60 * 60 + 1..24 * 60 * 60 -> hoursDeclination(onlineStatus)
        else -> daysDeclination(onlineStatus)
    }
}

fun minutesDeclination(seconds: Int) {
    val minutes = seconds / 60
    when {
        minutes % 10 !in 1..4 || minutes % 100 in 10..20 -> println("$minutes минут назад")
        minutes % 10 in 2..4 -> println("$minutes минуты назад")
        else -> println("$minutes минуту назад")
    }
}

fun hoursDeclination(seconds: Int) {
    val hours = seconds / 60 / 60
    when {
        hours % 10 !in 1..4 || hours % 100 in 10..20 -> println("$hours часов назад")
        hours % 10 in 2..4 -> println("$hours часа назад")
        else -> println("$hours час назад")
    }
}

fun daysDeclination(seconds: Int) {
    when (seconds / 60 / 60 / 24) {
        1 -> println("вчера")
        2 -> println("позавчера")
        else -> println("давно")
    }
}