public class Dog extends Animal {
    //Since we have created our own cons there is no default constrcutor

    private String earShape;
    private String tailShape;


    public Dog() {
        super("Golden Retreiver", "Big", 50); //similar to how we used to call another cons using this in the same class
    }

    //lets now make a dog specific constructor

    // to simplify dog creation with this specific attributes we can create another constrcutor
    public Dog(String type, double weight) {
        this(type, weight, "drop ear", "curly"); // we are calling the other constructor using overloading
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 25 ? "small" :
                        (weight < 35 ? "medium" : "large")
                , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

        //learning the need for protected.
        // type is inaccessible as it is private
        // hence we use protected to give subclass level
        if (type.equals("Wolf")) {
            System.out.println("Oh woooo!");
        } else {
            bark();
            System.out.println();
        }

    }

    @Override
    public void move(String speed) {
        super.move(speed); // calling the parent move method
        //System.out.println("Dogs walk, wag their tail");
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println(); //to move to the next line
    }

    //not every class needs to be public
    private void bark() {
        System.out.println("Woof");
    }

    private void run() {
        System.out.println(type + " running");
    }

    private void walk() {
        System.out.println(type + " running");
    }

    private void wagTail() {
        System.out.println("Tail Wagging");
    }
}
