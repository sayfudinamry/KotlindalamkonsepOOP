package id.ac.polbeng.depandi.test_kelas

fun main() {
    // Membuat instance dari interface menggunakan Anonymous Inner Class
    val programmer: Human = object : Human {
        override fun think() {
            // overriding method think()
            println("I am an example of Anonymous Inner Class")
        }
    }

    programmer.think()
}
interface Human {
    fun think()
}