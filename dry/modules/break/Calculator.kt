class Calculator {

    fun sqrt(value: Double): Double {
        return value * value
    }

    fun doubleSqrt(value: Double): Double {
        return 2 * sqrt(value)
    }

    fun pow(value: Double, exponent: Int): Double {
        return if(exponent == 0)
            1.0
        else {
            var result = value
            for(i in exponent downTo 1) {
                result *= value
            }
            result
        }
    }
    
    fun doublePow(value: Double, exponent: Int): Double {
        return 2 * pow(value, exponent)
    }
}