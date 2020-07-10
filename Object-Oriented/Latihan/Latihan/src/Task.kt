// TODO 1
class Cat(private var name: String) {
    var sleep: Boolean = false


    fun  getSleepCat(): Boolean {
        println("Fungsi getter dipanggil")
        return sleep
    }
    fun setSleepCat(value:Boolean){
        println("Fungsi setter dipanggil")
        sleep=value
    }

    fun toSleep() {
        if (sleep)
            println("$name, sleep!")
        else
            println("$name, let's play!")
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")
    gippy.getSleepCat()

    gippy.toSleep()
    gippy.setSleepCat(true)
    gippy.getSleepCat()
    gippy.sleep = true
    gippy.toSleep()
}