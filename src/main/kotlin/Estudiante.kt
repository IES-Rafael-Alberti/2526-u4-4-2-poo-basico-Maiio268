class Estudiante(private val nombre: String, var nota: Double) {
    init {
        require(nota in 0.0..10.0) { "ERROR. La nota tiene que ser entre 0 - 10" }
    }
    override fun toString(): String {
        return "--Estudiante--\nNombre: $nombre\nNota: $nota"
    }
}

fun main() {
    try {
        val estudiante1 = Estudiante("Oscar", 5.0)
        println(estudiante1)
        val estudiante2 = Estudiante("Jesus", -3.0)
    } catch (e: Exception) {
        println(e.message)
    }

}