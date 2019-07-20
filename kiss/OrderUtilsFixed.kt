//only single business comment, code is readable
object OrderUtilsFixed {

    //min amounts set by marketing department
    const val PROMOTION_AMOUNT_MIN_PRICE = 10.0
    const val PROMOTION_PERCENT_MIN_PRICE = 20.0

    fun calculateSum(products: List<Product>, promotions: List<Promotion>): Double {
        val productsPrice = getProductsPrice(products)
        return productsPrice - getDiscountAmount(productsPrice, promotions)
    }

    fun getProductsPrice(products: List<Product>): Double {
        var sum = 0.0
        for(product in products) {
            sum += product.price
        }
        return sum
    }

    fun getDiscountAmount(productsPrice: Double, promotions: List<Promotion>): Double {
        var discount = 0.0
        for(promotion in promotions) {
            if(canApplyPromotionAmount(promotion.amount, productsPrice, discount)) {
                discount += promotion.amount
            }
            else if(canApplyPromotionPercent(promotion.percent, productsPrice, discount)) {
                discount += productsPrice * promotion.percent
            }
        }
        return discount
    }

    fun canApplyPromotionAmount(amount: Double, productsPrice: Double, currentDiscount: Double): Boolean {
        return amount > 0 && productsPrice - (currentDiscount + amount) > PROMOTION_AMOUNT_MIN_PRICE
    }

    fun canApplyPromotionPercent(percent: Int, productsPrice: Double, currentDiscount: Double): Boolean {
        return percent > 0 && productsPrice - (currentDiscount + productsPrice * percent) > PROMOTION_PERCENT_MIN_PRICE
    }
}