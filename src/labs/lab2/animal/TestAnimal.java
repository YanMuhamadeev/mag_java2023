package labs.lab2.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Bird bird = new Bird("Anton",10,"Pereletnaya",true);
        System.out.println(bird.isFlying());
        bird.makeNoise();

        Dog dog = new Dog("Muha",3,"Brodyaga", false);
        System.out.println(dog.getBread());
        dog.makeNoise();
    }
}
