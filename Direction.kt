enum class Direccion {
    POSITIVE_Y {
        override fun siguiente() = POSITIVE_X
    },
    POSITIVE_X {
        override fun siguiente() = NEGATIVE_Y
    },
    NEGATIVE_Y {
        override fun siguiente() = NEGATIVE_X
    },
    NEGATIVE_X {
        override fun siguiente() = POSITIVE_Y
    };

    abstract fun siguiente(): Direccion
}