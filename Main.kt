fun main() {
    val robot = Robot("R2D2")
    val movimientos = listOf(
        intArrayOf(10, 5, -2),
        intArrayOf(0, 0, 0),
        intArrayOf(),
        intArrayOf(-10, -5, 2),
        intArrayOf(-10, -5, 2, 4, -8)
    )

    for (pasos in movimientos) {
        robot.mover(pasos)
        println(robot)
    }
}