fun main () {
    var hitpoint = 4890
    val damage = 250

    var enemyhitpoint = 5950
    val enemydamage = 300

while (hitpoint > 0 && enemyhitpoint > 0) {
    println(" y или p")
    var pa = readLine()
    if (pa == "y" )
        enemyhitpoint -= damage
    hitpoint -= enemydamage

    }
    if (hitpoint <= 0)
        println("ти умир")
    else
        println("ти пабидил")
}
