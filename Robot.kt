class Robot(nombre: String) {
    val nombre: String
    var posX: Int = 0
    var posY: Int = 0
    var direccion: Direction = Direction.POSITIVE_Y

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        this.nombre = nombre
    }

    fun mover(pasos: IntArray) {

        for (paso in pasos) {
            when (direccion) {
                Direction.POSITIVE_Y -> posY += paso
                Direction.POSITIVE_X -> posX += paso
                Direction.NEGATIVE_Y -> posY -= paso
                Direction.NEGATIVE_X -> posX -= paso
            }
        }

        direccion = direccion.siguiente()
    }

    override fun toString(): String {
        return """
            Direction ($posX, $posY)
            ~> X = $posX
            ~> Y = $posY
            ─────────────────────────────────
        """.trimIndent()
    }
}