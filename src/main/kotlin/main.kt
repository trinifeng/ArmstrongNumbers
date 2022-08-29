import kotlin.math.pow

fun main() {
    println("The four Armstrong numbers are:")
    for (hundreds in 1..9){
        for(tens in 0..9){
            for(ones in 0..9){
                var num = 100*hundreds + 10*tens + 1*ones
                var cube = (hundreds.toDouble()).pow(3) + (tens.toDouble()).pow(3) + (ones.toDouble()).pow(3)
                if(num.toDouble() == cube){
                    println(num.toInt())
                }
            }
        }
    }
}