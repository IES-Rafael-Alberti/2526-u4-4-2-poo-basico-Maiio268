class CuentaBancaria(var titular: String, private var saldo: Double = 0.0) {
    fun ingresarDinero(cantidad: Int){
        if (cantidad <= 0) {
            throw IllegalArgumentException("Cantidad introducida no valida")
        } else {
            this.saldo += cantidad
            println("Saldo final: $saldo")
        }
    }

    fun retirarDinero(cantidad: Int) {
        if (cantidad > saldo) {
            throw IllegalArgumentException("No puedes retirar mas dinero del disponible")
        } else {
            this.saldo -= cantidad
            println("Saldo final: $saldo")
        }
    }
}

fun main(){
    /* Cuenta bancaria con titular creada, ingreso de 100 y retiro de 50 */
    var CuentaBancaria1 = CuentaBancaria("Mario")
    try {
        CuentaBancaria1.ingresarDinero(100)
        CuentaBancaria1.retirarDinero(50)
        CuentaBancaria1.retirarDinero(500)
    } catch (e: Exception) {
        println(e.message)
    }

}