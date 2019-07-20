class Music(val index: Long, val title: String, val description: String, val year: Int,
            val band: String, val duration: Int) {

    fun getSummary(): String {
        return "$title ($year) \n $description"
    }
}