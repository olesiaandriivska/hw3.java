package hw3.part3;

public class Wolf extends WildAnimal {
    private int amount;

    public Wolf() {
        super();
    }

    public Wolf(int amount) {
        super();
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public void animal() {
        System.out.println("Wolf!");
    }
}
