public class CarsAssemble {
    private int maxProduced = 221;
    public double productionRatePerHour(int speed) {
        double result = speed * maxProduced;
        if(speed <= 4){
            return result;
        }else if(speed <= 8){
            return (result * 0.9);
        } else if (speed <= 9) {
            return (result * 0.8);
        }else {
            return (result * 0.77);
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed)/ 60;
    }
}
