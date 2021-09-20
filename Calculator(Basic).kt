fun main(){
    var bool = true
    while(bool){
        var num1: Int
        var num2: Int
        print("Enter your first number: ")
        try{
            num1 = readLine()!!.toInt()
        }catch (e: Exception){
            num1 = 0
        }
        print("Enter your second number: ")
        try{
            num2 = readLine()!!.toInt()
        }catch (e: Exception){
            num2 = 0
        }
        println("$num1 + $num2 = ${num1 + num2}")
        print("Would you like to add more numbers? (y/n)")
        val answer = readLine()
        when(answer){
            "Y" -> bool = true
            "y" -> bool = true
            else -> bool = false
        }
    }
    print("Thank you")
}