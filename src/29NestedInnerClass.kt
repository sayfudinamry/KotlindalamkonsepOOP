package id.ac.polbeng.depandi.test_kelas

class Outer {
    val a = "Outside Nested class."

    // Nested class (tidak bisa langsung akses member 'Outer')
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    // Mengakses properti dari Nested class langsung
    println(Outer.Nested().b)

    // Membuat objek dari Nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}
