/**
 * Created by SAINTEK 101 on 10/16/2017.
 */
fun main(args:Array<String>) {
    var arraylist = ArrayList<String>()
    arraylist.add("Faiz")
    arraylist.add("novrizal")
    arraylist.add("saja")
    arraylist.add("hop")

    println("First name:" + arraylist.get(0))

    println(" all element by object")
    for (item in arraylist) {
        println(item)
    }
}