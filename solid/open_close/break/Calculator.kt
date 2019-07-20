object Calculator {

    fun getArea(figure: Any): Double {
        return when (figure) {
            is Rectangle -> {
                figure.a * figure.b
            }
            is Triangle -> {
                val p = (figure.a + figure.b + figure.c) / 2
                sqrt(p * (p-figure.a) * (p-figure.b) * (p-figure.c))
            }
            is Circle -> {
                Math.PI * figure.r.pow(2.0)
            }
            else -> 0.0
        }
    }

    fun getCircumference(figure: Any): Double {
        return when (figure) {
            is Rectangle -> {
                2 * figure.a + 2 * figure.b
            }
            is Triangle -> {
                figure.a + figure.b + figure.c
            }
            is Circle -> {
                2 * Math.PI * figure.r
            }
            else -> 0.0
        }
    }
	
    //more methods
}