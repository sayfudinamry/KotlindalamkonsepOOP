package id.ac.polbeng.depandi.test_kelas

interface A {
    fun demo() {
        println("From interface A")
    }
}

interface B {
    fun demo() {
        println("From interface B")
    }
}

// Class ini mengimplementasikan interface A dan B
class MyClassB : A, B {
    // Harus override karena ada conflict (dua interface punya method "demo")
    override fun demo() {
        super<A>.demo()  // Panggil versi dari interface A
        super<B>.demo()  // Panggil versi dari interface B
    }
}

fun main() {
    val obj = MyClassB()
    obj.demo()
}
