//what this class can do? it suggests to store time data
object Time {

    const val MILISECONDS: Long = 36000 //what it is?

    //smaller than what? and what is time?
    fun isTimeSmaller(value: Long): Boolean {
        return value < System.currentTimeMillis()
    }

    //smaller than what?
    fun isDateSmaller(value: Date): Boolean {
        return value.time < System.currentTimeMillis()
    }

    //what does it mean?
    fun daysTime(value: Long): Long {
        return value / MILISECONDS
    }

    //what does it mean?
    fun daysDate(value: Date): Long {
        return value.time / MILISECONDS
    }
}