package id.ac.polbeng.depandi.test_kelas

// Child class (initializes the parent class)
class LaptopB : Computer {

    val batteryLife: Double

    // Primary constructor -> memanggil constructor parent (super)
    constructor(name: String, brand: String, batteryLife: Double) : super(name, brand) {
        this.batteryLife = batteryLife
    }

    // Secondary constructor -> memanggil constructor utama di atas
    constructor(name: String, brand: String) : this(name, brand, 0.0)

    fun info() {
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main() {
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    myLaptop.info() // jangan pakai println() di sini
}