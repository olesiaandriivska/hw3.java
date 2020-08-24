package hw3.part3;

public class Pet extends Animal {
    private String origin;

    public Pet() {
        super();
    }

    public Pet(String name, String origin) {
        super(name);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "origin='" + origin + '\'' +
                '}';
    }

    @Override
    public void animal() {
        System.out.println("This is pat!");
    }
}
