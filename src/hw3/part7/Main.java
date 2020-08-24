package hw3.part7;

public class Main {
    public static void main(String[] args) {
        Minus minus = new Minus();
        minus.calculate(16, 11);

        Plus plus = new Plus();
        plus.calculate(111, 456);

        Multiplication multiplication = new Multiplication();
        multiplication.calculate(123, 33);

        Division division = new Division();
        division.calculate(121,11);
    }

}
