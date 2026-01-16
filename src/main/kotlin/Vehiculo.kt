class Vehiculo(private val marca: String, private val modelo: String, private var kilometraje: Double = 0.0) {
    fun registrarViaje(kilometros: Double) {
        if (kilometros >= 0){
            kilometraje += kilometros
        } else {
            throw IllegalArgumentException("Los kilometros no pueden ser negativos")
        }
    }

    fun detalles(): String {
        return "Detalles del vehículo: $marca, $modelo, $kilometraje"
        }
    }

fun main() {
    val coche = Vehiculo("Audi", "S5", 0.0)
    try{
        coche.registrarViaje(-100.0)
        val detalles = coche.detalles()
        println(detalles)
    } catch(e: Exception){
        println(e.message)
    }

}