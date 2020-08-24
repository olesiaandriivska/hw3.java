package hw3.part2;

public class Dog extends Pet {
    private String breed;

    public Dog() {
        super();
    }

    public Dog(String name, String origin, String breed) {
        super(name, origin);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
