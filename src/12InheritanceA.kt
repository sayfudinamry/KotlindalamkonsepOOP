package id.ac.polbeng.depandi.test_kelas

// Child class (initializes the parent class)
class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand) {
    fun info() {
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main() {
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    myLaptop.info()
}