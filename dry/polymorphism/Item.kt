abstract class Item (val index: Long, val title: String, val description: String, val year: Int) {

    fun getSummary(): String {
        return "$title ($year) \n $description"
    }
}