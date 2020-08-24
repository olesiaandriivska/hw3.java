package hw3.part3;

public class Cat extends Pet {
    private int size;

    public Cat() {
        super();
    }

    public Cat(String name, String origin, int size) {
        super(name, origin);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "size=" + size +
                '}';
    }

    public void cat(){
        System.out.println("Mouww");
    }
}
