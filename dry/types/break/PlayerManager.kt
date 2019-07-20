class PlayerManager {

	fun changeNick(id: Long, newNick: String) {
        //put newNick to database or send to server
    }

    fun getLevel(points: Int): String {
        return when(points) {
            in 0..99 -> "BEGINNER"
            in 100..300 -> "JUNIOR"
            in 300..599 -> "ADVANCED"
            else -> "MASTER"
        }
    }
	
	fun increasePoints(id: Long, points: Int, percent: Int) {
        val newPoints = points + points * percent
        updateLevel(id, newPoints)
        //put newPoints to database or send to server using id
    }
	
	private fun updateLevel(id: Long, points: Int) {
        val newLevel = getLevel(points)
        //put newLevel to database or send to server using id
    }
}