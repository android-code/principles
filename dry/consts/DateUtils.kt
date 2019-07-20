class DateUtils {
    
    companion object {
        const val MILISECONDS_IN_DAYS: Long = 1000 * 60 * 60 * 24
    }

    fun getDaysInMiliseconds(miliseconds: Long): Long {
        return miliseconds / MILISECONDS_IN_DAYS
    }

    fun getMilisecondsInDays(days: Long): Long {
        return days * MILISECONDS_IN_DAYS
    }
}