class Book(index: Long, title: String, description: String, year: Int,
                val author: String, val topics: List<String>) : Item(index, title, description, year), Printable {

    override fun print() {
        //get Book from database by index and print to file
    }
}