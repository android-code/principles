//a lot of comments explanations of steps
object OrderUtils {
    
    fun calculateSum(products: List<Product>, promotions: List<Promotion>): Double {
        //calculate sum of products
        var sum = 0.0
        for(product in products) {
            sum += product.price
        }

        //calculate total discount from prioritized promotions
        var discount = 0.0
        for(promotion in promotions) {
            //promotions can be amount or percent only
            if(promotion.amount > 0) {
                //amount promotion can by apply only when total sum is at least 10 zloty
                if(sum - (discount + promotion.amount) > 10.0) {
                    discount += promotion.amount
                }
            }
            else if(promotion.percent > 0) {
                //amount promotion can by apply only when total sum is at least 20 zloty
                if(sum - (discount + sum * promotion.percent) > 20.0) {
                    discount += sum * promotion.percent
                }
            }
        }

        return sum - discount
    }
}