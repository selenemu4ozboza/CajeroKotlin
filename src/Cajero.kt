class Cajero {

    // Saldo inicial del cajero

    var saldo = 500.0

    //Funcion que muestra el saldo disponible
    fun consultarSaldo() {
        println("Tu saldo actual es:  $saldo  €")
    }
    // Funcion que permite ingresar el dinero al cajero
    fun ingresarDinero() {
        print("Introduce la cantidad a ingresar: ")
        val cantidad = readln().toDoubleOrNull()

        // Comprueba que la cantidad sea válida
        if (cantidad != null && cantidad > 0) {
            saldo += cantidad
            println("Ingreso realizado correctamente.")
            println("Saldo actual: $saldo €")
        } else {
            println("Error: introduce una cantidad válida.")
        }
    }

    //Función que permite retirar el dinero del cajero
    fun retirarDinero() {
        print("Introduce la cantidad a retirar: ")
        val cantidad = readln().toDoubleOrNull()

        // Comprueba que la cantidad sea valida y que haya saldo suficiente
        if (cantidad == null || cantidad <= 0) {
            println("Error: introduce una cantidad válida.")
        } else if (cantidad > saldo) {
            println("Error: saldo insuficiente.")
        } else {
            saldo -= cantidad
            println("Retirada realizada correctamente.")
            println("Saldo actual: $saldo €")
        }
    }
}