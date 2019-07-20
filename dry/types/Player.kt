data class Player(val id: Long, var nick: String, var points: Int, var level: Level) {

    init {
        updateLevel()
    }

    fun increasePointsByPercent(percent: Int) {
        points += points * percent
        updateLevel()
    }

    fun updateLevel() {
        level = when(points) {
            in 0..99 -> Level.BEGINNER
            in 100..300 -> Level.JUNIOR
            in 300..599 -> Level.ADVANCED
            else -> Level.MASTER
        }
    }

    enum class Level(value: String) {
        BEGINNER("BEGINNER"),
        JUNIOR("JUNIOR"),
        ADVANCED("ADVANCED"),
        MASTER("MASTER")
    }
}