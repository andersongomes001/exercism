public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int min){
        return this.expectedMinutesInOven() - min;
    }
    public int preparationTimeInMinutes(int min){
        return min * 2;
    }
    public int totalTimeInMinutes(int first, int second){
        return this.preparationTimeInMinutes(first) + second;
    }
}
