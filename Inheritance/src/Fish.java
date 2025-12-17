public class Fish extends Animal {

    private int fins;
    private int gills;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {
        System.out.println("muscles moving");
    }

    private void moveBackFins() {
        System.out.println("back fins moving");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed.equals("fast")) {
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public void makeNoise() {

    }
}
