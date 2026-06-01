import kotlin.math.pow
import kotlin.math.sqrt

object Darts {

    fun score(x: Number, y: Number /* choose proper types! */): Int {
        val radius:Int = 10;
        val xCenter : Double = 0.0;
        val yCenter : Double = 0.0;
        //"(x – a)² + (y – b)² = r²"
        val distance: Double = sqrt(
                xCenter.minus(x.toDouble()).pow(2.0) + yCenter.minus(y.toDouble()).pow(2.0)
            );
        if(distance <= radius){
            return if(distance <= 1){
                10;
            }else if(distance <= 5){
                5;
            }else {
                1;
            }
        }
        return 0;
    }
}
