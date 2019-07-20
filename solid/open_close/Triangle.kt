class Triangle(val a: Double, val b: Double, val c: Double) : Figure() {
    
    override fun getArea(): Double {
        val p = (a + b + c) / 2
        return sqrt(p * (p-a) * (p-b) * (p-c))
    }

    override fun getCircumference(): Double {
        return a + b + c
    }
}