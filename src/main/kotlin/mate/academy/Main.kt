package mate.academy

fun greetUsers() {
    while (true) {
        print("Please enter a name (or press Enter to quit): ")
        val name = readlnOrNull() ?: ""
        if (name.isEmpty()) break
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}
