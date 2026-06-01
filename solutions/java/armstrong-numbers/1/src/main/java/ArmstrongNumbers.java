import java.util.Arrays;
import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        double total = Arrays
                .stream(String.valueOf(numberToCheck).split(""))
                .map(Integer::valueOf)
                .toList()
                .stream()
                .map(x -> Math.pow(x, String.valueOf(numberToCheck).length()))
                .reduce(0d, Double::sum);
        return total == numberToCheck;
    }

}
