package hw3.part3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animal();

        Pet pet = new Pet();
        pet.animal();

        Dog dog = new Dog();
        dog.animal();

        Cat cat = new Cat();
        cat.cat();

        WildAnimal wildAnimal = new WildAnimal();
        wildAnimal.animal();

        Wolf wolf = new Wolf();
        wolf.animal();

        Fox fox = new Fox();
        fox.fox();
    }

}
