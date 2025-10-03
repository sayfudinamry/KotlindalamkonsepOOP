package id.ac.polbeng.depandi.test_kelas

fun main() {
    val greeter = `01Greeter`()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}
