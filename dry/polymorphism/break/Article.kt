class Article(val index: Long, val title: String, val description: String, val year: Int,
              val author: String, val pages: Int) {

    fun getSummary(): String {
        return "$title ($year) \n $description"
    }

    fun print() {
        //get Article from database by index and print to file
    }
}