package hw3.part2;

public class Fox extends WildAnimal {
    private String kind;

    public Fox() {
        super();
    }

    public Fox(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "kind='" + kind + '\'' +
                '}';
    }
}
