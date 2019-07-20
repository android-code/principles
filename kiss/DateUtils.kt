//Time class fixed
//names explain the purpose
object DateUtils {

    const val MILISECONDS_IN_HOURS: Long = 1000 * 60 * 60

    fun isPast(timestamp: Long): Boolean {
        return timestamp < System.currentTimeMillis()
    }

    fun isPast(date: Date): Boolean {
        return date.time < System.currentTimeMillis()
    }

    fun getFullDays(timestamp: Long): Long {
        return timestamp / MILISECONDS_IN_HOURS
    }

    fun getFullDays(date: Date): Long {
        return date.time / MILISECONDS_IN_HOURS
    }
}