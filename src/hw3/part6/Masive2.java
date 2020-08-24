package hw3.part6;

public class Masive2 implements Creator{
    private int x;
    private int lenght;

    public Masive2() {
    }

    public Masive2(int x, int lenght) {
        this.x = x;
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Masive2{" +
                "x=" + x +
                ", lenght=" + lenght +
                '}';
    }

    @Override
    public int[] creator() {
        int[] array;
        array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * x));
        }
        return array;
    }
}
