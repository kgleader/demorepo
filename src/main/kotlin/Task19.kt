

fun main() {
	val person1 = Employee("Asan", "Uson", 27, 2)

	val person2 = Employee("Asan", "Uson", 27, 2)

	val person3: Employee = person1.copy(surName = "Usonov")

	println(person1.toString())
	println(person1 == person2)
	println(person1 == person3)
	println("person3: $person3")
}

data class Employee(
	val name: String,
	val surName: String,
	val age: Int,
	val experience: Int) {
}

