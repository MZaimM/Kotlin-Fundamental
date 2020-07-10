fun main() {

    // TODO 1
    val vehicle = mapOf(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = "Type: "
    val maxSpeed = "Maximal Speed: "
    val maxTank = "Maximal Tank: "

    // TODO 3
    println("Vehicle")
    println(type+vehicle.get("type"))
    println(maxSpeed+vehicle.get("maxSpeed"))
    println(maxTank+vehicle.get("maxTank"))

}