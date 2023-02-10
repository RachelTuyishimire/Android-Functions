fun main() {
salutation("Rachel")
    var m= getRemainder(6, 4)
    println(m)
    var y= summation(3, 4, 7, 5)
    println(y)
    aboutMe("is that I'm very stubborn at sometimes")
}
fun salutation(name1: String){
    println("Hello $name1")
}
fun getRemainder(num1: Int, num2: Int): Int{
var remainder= num1 % num2
    return remainder
}
fun summation(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var addition= num1+num2+num3+num4
    return addition
}
fun aboutMe(interest1: String){
println("Interesting fact about me $interest1")
}