fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.mapNotNull { 
        try {
            it * 2
        } catch (e: Exception) {
            println("Error processing element: ${e.message}")
            null
        }
    }
    println(result)
}