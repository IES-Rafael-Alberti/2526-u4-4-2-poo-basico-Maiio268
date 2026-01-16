class Libro(val titulo: String, val autor: String, val numPaginas: Int, var leido: Boolean = false) {
    init{
        require(titulo.isNotBlank()) { "Titulo no puede estar vacío" }
        require(autor.isNotBlank()) { "Autor no puede estar vacío" }
        require(numPaginas in 1..5000) { "El número de páginas tiene que estar entre 0 - 5000" }
    }

    constructor(titulo: String, autor: String) : this(titulo, autor, 200, false)

    override fun toString(): String {
        var sidoLeido: String = ""
        if (leido) {
            sidoLeido = "Si"
        } else {
            sidoLeido = "No"
        }
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leído: $sidoLeido"
    }
}

fun main() {
    try {
        var libro1 = Libro("Cars", "Chicote", 1000, true)
        println(libro1)
        var libroSinTitulo = Libro("", "Abraham Mateo")
    } catch (e: Exception) {
        println(e.message)
    }
}
