class Circle (val r: Double) : Figure() {

    override fun getArea(): Double {
        return Math.PI * r.pow(2.0)
    }

    override fun getCircumference(): Double {
        return 2 * Math.PI * r
    }
}
