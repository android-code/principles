class Film(index: Long, title: String, description: String, year: Int,
           val director: String, val actors: List<Actor>, val duration: Int) : Item(index, title, description, year)