package hw3.part4;

public class Workstation extends Computer {
    private int countOfComputer;

    public Workstation() {
        super();
    }

    public Workstation(String model, double size, int countOfComputer) {
        super(model, size);
        this.countOfComputer = countOfComputer;
    }

    public int getCountOfComputer() {
        return countOfComputer;
    }

    public void setCountOfComputer(int countOfComputer) {
        this.countOfComputer = countOfComputer;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "countOfComputer=" + countOfComputer +
                '}';
    }
}
