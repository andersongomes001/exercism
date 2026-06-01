public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int drive = 0;
    public void drive() {
        drive += 1;
    }

    public int getDistanceTravelled() {
        return drive * 20;
    }
}
