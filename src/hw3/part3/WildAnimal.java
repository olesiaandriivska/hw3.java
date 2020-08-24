package hw3.part3;

public class WildAnimal extends Animal {
    private int age;

    public WildAnimal() {
        super();
    }

    public WildAnimal(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "age=" + age +
                '}';
    }

    @Override
    public void animal() {
        System.out.println("This is wildanimal!");
    }
}
