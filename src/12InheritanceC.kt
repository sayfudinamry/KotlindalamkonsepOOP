package id.ac.polbeng.depandi.test_kelas

open class Teacher {
    // Harus pakai "open" supaya bisa dioverride
    open fun teach() {
        println("Teaching...")
    }

    fun info() {
        println("I'm a Teacher.")
    }
}

class MathsTeacher : Teacher() {
    // Override fungsi teach()
    override fun teach() {
        println("Teaching Maths...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()

    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}
