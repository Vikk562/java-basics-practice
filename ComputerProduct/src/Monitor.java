import java.util.Scanner;

public class Monitor extends Product {

    Scanner scanner = new Scanner(System.in);

    private String resolution;
    private int FPS;

    public Monitor(double weight, double height,
                   double depth, double price, String manufacturer,
                   String model, String resolution, int FPS) {
        super(weight, height, depth, price, manufacturer, model);
        this.resolution = resolution;
        this.FPS = FPS;
    }

    public void changeResolution(String resolution) {
        System.out.println("Your current resolution is " + this.resolution);
        System.out.println("Are you sure you want to " +
                "change your resolution to " + resolution);
        boolean approvalUser = scanner.nextBoolean();
        if (approvalUser) {
            this.resolution = resolution;
            System.out.println("You're resolution has been updated!");
        }
    }

    @Override
    public void describe() {
        System.out.println( "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", FPS=" + FPS +
                "} ");
    }


}
