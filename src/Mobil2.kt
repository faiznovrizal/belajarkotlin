/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
class Mobil2 {
    var mesin = 1
    var roda = 4
    var body = 1

}

fun main (args : Array<String>) {
    var avanza = Mobil2()
    var innova = Mobil2()

    println("roda avanza: " + avanza.roda)
    println("roda innova: " + innova.roda)
    avanza.roda=5
    println("roda avanza: " + avanza.roda)
    println("roda innova: " + innova.roda)

    println("mesin avanza: " + avanza.mesin)
    println("mesin innova: " + innova.mesin)
    avanza.mesin=2
    println("roda avanza: " + avanza.roda)
    println("roda innova: " + innova.roda)
}