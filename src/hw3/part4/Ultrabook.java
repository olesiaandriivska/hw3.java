package hw3.part4;

public class Ultrabook extends Leptop {
    private int weight;
    private int thickness;

    public Ultrabook() {
        super();
    }

    public Ultrabook(String model, double size, int memory, String videoCard, int weight, int thickness) {
        super(model, size, memory, videoCard);
        this.weight = weight;
        this.thickness = thickness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "weight=" + weight +
                ", thickness=" + thickness +
                '}';
    }
}
