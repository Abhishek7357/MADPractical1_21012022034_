fun findmax(a:Array<Int>){
    var max = a[0]
    var count = 0
    for (i in a) {
        println("ar[$count] = $i")
        if (i > max) {
            max = i
        }
        count++
    }
    println("largest number is_:")
    println(max)
}
fun main()
{
    var a = arrayOf(13, 10, 1321, 52, 85, 114)
    findmax(a)

}