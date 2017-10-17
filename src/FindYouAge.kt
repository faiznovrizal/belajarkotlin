/**
 * Created by SAINTEK 101 on 10/1/2017.
 */
fun main(args:Array<String>){
    //input
    print("Enter your DOB: ")
    var DOB:Int= readLine()!!.toInt()

    //proses
    var year=2017
    var Age:Int?
    Age=year-DOB

    //output
    println("Your age is $Age years")
}