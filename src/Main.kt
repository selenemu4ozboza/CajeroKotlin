
fun main() {
        // Creamos los objetos para utilizar sus funciones
        val cajero = Cajero()
        var opcion: Int
        val funciones = Funciones()

    //Repite el menú hasta que el usuario decida salir
        do {
            funciones.mostrarMenu()
            opcion = readln().toIntOrNull() ?: 0

            when (opcion) {
                1 -> cajero.consultarSaldo()
                2 -> cajero.ingresarDinero()
                3 -> cajero.retirarDinero()
                4 -> println("Gracias por utilizar nuestro cajero.")
                else -> println("Error: opción no válida.")
            }

        } while (opcion != 4)
    }
