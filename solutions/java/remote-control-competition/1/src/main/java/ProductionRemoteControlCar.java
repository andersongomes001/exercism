class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int drive = 0;
    private int victories = 0;
    public void drive() {
        drive += 1;
    }

    public int getDistanceTravelled() {
        return drive * 10;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(o.getNumberOfVictories(),this.getNumberOfVictories());
    }
}
