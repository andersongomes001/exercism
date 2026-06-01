import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length -1] = this.getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        int[] filter = Arrays.stream(this.birdsPerDay).filter(x -> {
            return x == 0;
        }).toArray();
        return filter.length > 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for(int i=0;i<this.birdsPerDay.length;i++){
            if(i < numberOfDays){
                count = count + this.birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() {
        int[] filter = Arrays.stream(this.birdsPerDay).filter(x -> {
            return x >= 5;
        }).toArray();
        return filter.length;
    }
}
