package kotlintest

class A {

    fun m1() {
    println("developer1")
    }

    fun m2() {
        println("Branch B calling....")
    }
}


fun main() {
    val a = A()
    a.m1()
    a.m2()
}