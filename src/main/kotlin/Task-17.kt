import jdk.jfr.Percentage
import kotlin.math.pow

fun main() {
	val money = readLine()!!.toInt()
	val percent = readLine()!!.toInt()
	val otvet = percentInThreeYears(money, percent)
	println(otvet)
}

fun percentInThreeYears(initial: Int, percent: Int): Double {
	val sum = initial * (1 + percent / 100.toDouble()).pow(3)
	return sum
}

