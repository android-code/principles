class DateUtils {

    fun getDaysInMiliseconds(miliseconds: Long): Long {
        return miliseconds / 1000 * 60 * 60 * 24
    }
    
    fun getMilisecondsInDays(days: Long): Long { 
        return days * 1000 * 60 * 60 * 24
    }
}