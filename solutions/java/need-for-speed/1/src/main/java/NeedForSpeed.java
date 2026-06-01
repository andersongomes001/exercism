class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance =0;
    private int batteries = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return !(this.batteries > 0);
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(this.batteries > 0){
            this.distance += speed;
            this.batteries -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        int speed = 50;
        int batteryDrain = 4;
        return new NeedForSpeed(speed, batteryDrain);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.distanceDriven() < distance && !car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
