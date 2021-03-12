

fun main() {
	println(getMax(7, 6))
	println(getMax(7.0, 9.0))
	println(getMax(3, 4, 5))
	sayHello(name = "Java", reps = 2)

	printInts(1)

}

fun printInts(vararg ints: Int){
	for(i in ints) println(i)

}


fun sayHello(name: String = "Kotlin", reps: Int = 1) {
	var counter = reps

	while (counter> 0) {
		println("Hello $name! Where are you?")
		counter--
	}
}

fun getMax(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

fun getMax(num1: Int, num2: Int, num3: Int): Int {
	return when {
		num1 > num2 && num1 > num3 -> num1
		num2 > num2 && num2 > num3 -> num2
		else -> num3
	}
}

fun getMax(num1: Double, num2: Double): Double {
	return if (num1 > num2) num1 else num2
}


