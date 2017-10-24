/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class Mobil4(mesin: Int, roda: Int, body: Int) {
    init {
        println("Mesin: $mesin, Roda: $roda, Body: $body")
    }
}


fun main(args: Array<String>) {
    var avanza = Mobil4(1, 4, 1)
    var innova = Mobil4(2, 5, 2)
}