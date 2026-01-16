class Producto(private val nombre:String, private val precio:Int, private var stock:Int) {
    init {
        require(precio > 0) {"El precio tiene que ser positivo"}
        require(stock > 0) {"El stock tiene que positivo"}
    }

    fun vender(cantidad: Int) {
        require(cantidad > 0) {"La cantidad debe ser positiva"}
        stock -= cantidad
    }
    fun reabastecer(cantidad: Int) {
        require(cantidad > 0) {"La cantidad debe ser positiva"}
        stock += cantidad
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio€, Stock: $stock."
    }
}

fun main() {
    var producto1 = Producto("Ratón Logitech", 50, 500)
    producto1.vender(100)
    println(producto1)
    var producto2 = Producto("Televisor", 200, 100)
    producto2.reabastecer(30)
    println(producto2)
}