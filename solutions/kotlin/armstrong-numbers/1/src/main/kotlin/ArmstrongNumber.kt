import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val result = input
            .toString()
            .map {
                number ->
                number.toString().toDouble().pow(input.toString().length.toDouble())
            }
            .reduce { acc, d -> acc + d }.toInt();
        return result == input;
    }
}
