import kotlin.system.exitProcess

fun main(args: Array<String>) {
    imprimirMenu()
    seleccionarMenu()
}

fun seleccionarMenu() {
    var opcion:String? = readLine()

    var opcionToInt = opcion?.toInt() ?: 0

    when(opcionToInt){
        1-> {
            println("Usted ha seleccionado \"Hacer una receta\"")
        makeRecipe()
        }

        2-> {
            println("Usted ha seleccionado \"Ver mis recetas\"")
            myRecipes()
        }

        3->{
            println("Usted ha seleccionado \"Salir\"")
            exitProcess(0)
        }
        else
    }
}

fun myRecipes() {
    TODO("Not yet implemented")
}

fun makeRecipe(){
    TODO("Not yet implemented")
}
fun imprimirMenu(){
    println("""
        :: Bienvenido a Recipe Maker ::


        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())
}