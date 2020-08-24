package hw3.part4;

public class PersonalComputer extends Computer {
    private int power;
    private String country;

    public PersonalComputer() {
        super();
    }

    public PersonalComputer(String model, double size, int power, String country) {
        super(model, size);
        this.power = power;
        this.country = country;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "power=" + power +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public void computer() {
        System.out.println("Yess");
    }
}
