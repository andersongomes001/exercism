public class ElonsToyCar {
    int distance = 0;
    int battery = 100;
    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %s meters", distance);
    }

    public String batteryDisplay() {
        if(battery <= 0){
            return "Battery empty";
        }
        return "Battery at <PERCENTAGE>%".replace("<PERCENTAGE>", String.valueOf(battery));
    }

    public void drive() {
        if(battery > 0){
            distance = distance + 20;
            battery = battery - 1;
        }
    }
}
