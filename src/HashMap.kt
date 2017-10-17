/**
 * Created by SAINTEK 101 on 10/16/2017.
 */
fun main(args:Array<String>){

    var map=HashMap<Int,String>()
    map.put(1,"Faiz")
    map.put(2,"Novrizal")
    map.put(3,"saja")
    println(map.get(33))

    map.put(33,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }
}