public abstract class Product {

    protected String manufacturer;
    protected String model;

    private double weight;
    private double height;
    private double depth;
    private double price;


    public Product(double weight, double height, double depth, double price, String manufacturer, String model) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
    }

//    public void describe() {
//        System.out.println("Here is some features about your product ");
//    }

    //or can do public abstract void describe();

    public double getPrice() {
        return price;
    }

    public abstract void describe();

    //public abstract
}
