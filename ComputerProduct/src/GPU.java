public class GPU extends Product{

    private int vRAM;
    private int noOfFans;
    private boolean isEnabled;


    public GPU(double weight, double height, double depth,
               double price, String manufacturer,
               String model, int vRAM, int noOfFans) {
        super(weight, height, depth, price, manufacturer, model);
        this.vRAM = vRAM;
        this.noOfFans = noOfFans;
    }

    public void toggleGPU() {
        if (!GPU.isEnabled) {
            GPU.isEnabled = true;
            System.out.println("The GPU is activated");
        } else {
            GPU.isEnabled = false;
            System.out.println("The GPU is deactivated");
        }
        this.status();
    }

    public void status() {
        if(GPU.isEnabled) {
            System.out.println("The GPU is running fine");
        } else {
            System.out.println("The GPU is turned off please turn it on for status");
        }
    }

    @Override
    public void describe() {
        System.out.println( "GPU{" +
                "vRAM=" + vRAM +
                ", noOfFans=" + noOfFans +
                "} " + super.toString());
    }
}
