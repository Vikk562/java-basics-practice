public class Main {

    public static void main(String[] args) {

        // working of runtime polymorphism
        Product dell = new Monitor(10.00, 65, 5,
                1000, "Dell", "P4410",
                "1920x1080", 120);

        dell.describe();

        Monitor samsung = new Monitor(12, 56, 4,
                1200, "Samsung", "Odeyssey",
                "2160x1440", 144);

        samsung.describe();

        //System.out.println(samsung.getPrice());

        //samsung.changeResolution("3840x2160");

        samsung.describe();

        GPU nvidia = new GPU(5, 30, 8, 800,
                "Nvidia", "RTX 5060", 8,
                2);

        nvidia.describe();

        //nvidia.status();

        nvidia.toggleGPU();

        nvidia.toggleGPU();


    }
}
