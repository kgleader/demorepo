
fun main(){

	// TASK 1

//	val animal = Cat("Bob", 5, "good", 3)
//
//	val animal1 = Cat("Bob", 5, "good", 3)
//
//
//	println(animal.toString())
//	println(animal == animal1)
//
//}
//
//data class Cat(
//	val name: String,
//	val age: Int,
//	val satietyLevel: String,
//	val waterLevel: Int){


	//TASK 2

	val book = Book("Magic flower", "John Mark", 2010)

	val book1 =  Book("Hello World", "John Mark", 2011)

	val book2:  Book = book.copy()

	println(book.toString())
	println(book == book1)
	println(book == book2)
	println("book1: $book2")
}

data class Book(
	val name: String,
	val author: String,
	val year: Int){

}