//don't mix guidelines, harder to maintain and understand by team
class NumberManager(private var number: Int) {
    
    companion object {
        const val ONE_HUNDRED = 100
    }

    fun multiplyNumber(value: Int) {
        number *= value
    }
}