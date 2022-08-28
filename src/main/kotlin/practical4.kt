fun main(){
    print("Enter the Number:")
    val number= readLine()!!.toInt()
    if(number%2==0){
        println(" Entered $number  number is even")
    }
    else{
        println("Entered $number number is odd")

    }
}