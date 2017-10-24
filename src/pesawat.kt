/**
 * Created by SAINTEK 101 on 10/24/2017.
 */
open class pesawat{
    val sayap : Int = 2

    open fun terbang(){
        println ("terbang...")
    }

    fun mendarat(){
        print("mendarat...")
    }
}
class pesawattempur : pesawat(){
    var rudal : Int = 4

    fun manuver(){
        println("manuver...")

    }
    override fun terbang() {
        println("terbang ala tempur..")
    }
}

fun main(args: Array<String>) {
    var boeing = pesawat()
    var f16 = pesawattempur()

    boeing.terbang()
    f16.terbang()

    boeing.mendarat()
    f16.mendarat()

    f16.manuver()
}