class Film(val index: Long, val title: String, val description: String, val year: Int,
           val director: String, val actors: List<Actor>, val duration: Int) {

    fun getSummary(): String {
        return "$title ($year) \n $description"
    }
}