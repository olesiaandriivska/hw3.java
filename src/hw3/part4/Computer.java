package hw3.part4;

public class Computer {
    private String model;
    private double size;

    public Computer() {
    }

    public Computer(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", size=" + size +
                '}';
    }

    public void computer(){
        System.out.println("This is my Computer");
    }
}
