import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Enter x^2 coefficient : ")
    var a = readLine()!!.toDouble()
    println("Enter x coefficient : ")
    var b = readLine()!!.toDouble()
    println("Enter Fixed coefficient  : ")
    var c = readLine()!!.toDouble()
    val delta : Double = (b * b) - (4 * a * c)
    println("delta is : $delta \n")

    if(delta < 0 )
    {
        println(" the equation doesnt have roots !!! ")
    }else
    {
        val x1 : Double = ( -b + sqrt(delta))/(2 * a)
        if(delta > 0)
        {
            val x2 : Double = ( -b - sqrt(delta))/(2 * a)
            println("root 1 is : $x1       and     root 2 is : $x2")
        }else {
            println("root is : $x1")
        }
    }


}