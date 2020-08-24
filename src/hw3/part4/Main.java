package hw3.part4;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.computer();

        PersonalComputer personalComputer = new PersonalComputer();
        personalComputer.computer();

        Workstation workstation = new Workstation();

        Leptop leptop = new Leptop();
        leptop.leptop();

        Ultrabook ultrabook = new Ultrabook();
    }
}
