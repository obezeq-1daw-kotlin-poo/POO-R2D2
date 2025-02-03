class Robot(nombre: String) {
    val nombre: String
    var posX: Int = 0
    var posY: Int = 0
    var direccion: Direccion = Direccion.POSITIVE_Y

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        this.nombre = nombre
    }

    fun mover(pasos: IntArray) {

        for (paso in pasos) {
            when (direccion) {
                Direccion.POSITIVE_Y -> posY += paso
                Direccion.POSITIVE_X -> posX += paso
                Direccion.NEGATIVE_Y -> posY -= paso
                Direccion.NEGATIVE_X -> posX -= paso
            }
        }

        direccion = direccion.siguiente()
    }

    override fun toString(): String {
        return "$nombre está en ($posX, $posY) $direccion"
    }
}