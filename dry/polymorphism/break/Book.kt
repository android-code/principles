class Book(val index: Long, val title: String, val description: String, val year: Int,
                val author: String, val topics: List<String>) {

    fun getSummary(): String {
        return "$title ($year) \n $description"
    }

    fun print() {
        //get Book from database by index and print to file
    }
}