/**
 * Created by SAINTEK 101 on 10/16/2017.
 */
fun main(args:Array<String>){

var arrayInt=Array<Int>(5){0}
arrayInt[3]=55
println("Array[3]="+ arrayInt[3])

        println("Al element by object")
        for (element in arrayInt){
    println(element)
}
println("Al elemet by index")
    for(index in 0..4){
    }

        var arrayStr=Array<String>(4){""}
for (index in 0..3){
    print("ArrayStr[ $index ]=")
    arrayStr[index]= readLine()!!
}

for (index in 0..3){
    println("arrayStr[ $index ]=" + arrayStr[index])
}
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

    arraylist.set(0,"Unisnu jepara")

    println(" all element by index")
    for( index in 0..arraylist.size-1){
    }

    //search
    if( arraylist.contains("Hussein")){
        println(" name is found")
    }else{
        println("name is not found")
    }
}