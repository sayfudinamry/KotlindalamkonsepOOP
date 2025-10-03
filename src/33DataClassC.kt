package id.ac.polbeng.depandi.test_kelas

fun main() {
    val meri = Student("Meri", 20)
    // copy() membuat objek baru dengan properti sama, bisa ubah sebagian
    val badu = meri.copy(name = "Badu")
    if (meri.equals(badu))
        println("meri is equal to badu.")
    else
        println("meri is not equal to badu.")

    println("Hashcode of meri: ${meri.hashCode()}")
    println("Hashcode of badu: ${badu.hashCode()}")
}
