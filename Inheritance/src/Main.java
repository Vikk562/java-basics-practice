public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge",
                400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yo" +
                "rkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog Pug = new Dog("Pug", 15, "Drop ear", "curly");
        doAnimalStuff(Pug, "slow");

        Dog wolf = new Dog("Wolf", 65.0, "sharp", "straight");
        doAnimalStuff(wolf, "fast");

        Fish clownfish = new Fish("clownfish", 2.0, 2, 9);
        doAnimalStuff(clownfish, "fast");

        System.out.println("-------------------Understanding polymorphism-------------");

        Dog labrador = new Dog("labrador", 35);
        labrador.makeNoise();

        Animal dalmation = new Dog("dalamation", 45);
        dalmation.makeNoise();



    }

    // create a method on the main class that will take any animal object and execute its 3 methods
    public static void doAnimalStuff (Animal animal, String speed) {


        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____");
    }
}
