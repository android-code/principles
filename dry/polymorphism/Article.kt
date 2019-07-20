class Article(index: Long, title: String, description: String, year: Int,
              val author: String, val pages: Int) : Item(index, title, description, year), Printable {

    override fun print() {
        //get Article from database by index and print to file
    }
}