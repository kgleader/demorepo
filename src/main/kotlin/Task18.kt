import java.net.Inet4Address

fun main(){
	val person = Person("Asan", "Uson", 27)

	println(person.name)
	println(person.surName)
	println(person.age)

	person.introduceYourself()

	val employee = Employee("Elon", "Musk", 40, 48)

	employee.introduceYourself()


}


open class Person(val name: String, val surName: String, val age: Int){


	open fun introduceYourself(){
		println("my home is $name, i love programming")
	}
}

class Employee(name: String,surName: String, age: Int, val experience: Int) : Person(name,surName,age){

	override fun introduceYourself() {
		println("my name is $name $surName, i have $experience years of experience")
	}

}