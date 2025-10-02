package id.ac.polbeng.depandi.test_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25   // default age = 25

    // Constructor pertama (2 parameter)
    constructor(_firstName: String, _lastName: String) {
        firstName = _firstName
        lastName = _lastName
    }

    // Constructor kedua (3 parameter)
    constructor(_firstName: String, _lastName: String, _age: Int) : this(_firstName, _lastName) {
        age = _age
    }

    fun cetakInfo() {
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main() {
    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()

    println()

    val budi = PersonE("Budi", "Gunawan", 21)
    budi.cetakInfo()
}
