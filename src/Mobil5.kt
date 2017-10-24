/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class Mobil5 (val mesin : Int){
    constructor(roda:Int, body:Int):this (1){
        println("di cetak dari secondary construction")
        println("Mesin : ${this.mesin}, roda : $roda, body : $body")
    }

}

fun main(args: Array<String>) {
    var mobilku = Mobil5 (4,1)


}