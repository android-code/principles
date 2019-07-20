class Calculator {

    //use Math module instead of own functions
    
    fun doubleSqrt(value: Double): Double {
        return 2 * Math.sqrt(value)
    }

    fun doublePow(value: Double, exponent: Int): Double {
        return 2 * Math.pow(value, exponent.toDouble())
    }
}