package id.ac.polbeng.depandi.test_kelas

fun main() {
    val meri = Student("Meri", 20)

    // Destructuring Declaration dengan componentN()
    val name = meri.component1()
    val age = meri.component2()

    println("Name = $name")
    println("Age = $age")
}