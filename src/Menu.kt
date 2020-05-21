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
            viewRecipes()
        }

        3->{
            println("Usted ha seleccionado \"Salir\"")
            exitProcess(0)
        }
        else->{
            println("No ha seleccionado correctamente, adiós")
            exitProcess(0)
        }
    }
}

fun viewRecipes() {
    println("Ver mis recetas")
}

fun makeRecipe(){
    val arreglo = arrayOf("1. Agua","2. Leche","3. Carne","4. Verduras","5. Frutas","6. Cereal","7. Huevos","8. Aceites")
    val listaDeRecetas = {
        for (i in arreglo){
            println(i)
        }
    }
    println("Hacer receta\nSelecciona por categoría el ingrediente que buscas")
    listaDeRecetas()
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