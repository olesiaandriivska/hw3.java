package hw3.part6;

public class Masive1 implements Creator{

    private int lenght;

    public Masive1() {
    }

    public Masive1(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Masive1{" +
                "lenght=" + lenght +
                '}';
    }

    @Override
    public int[] creator() {

        int[] array;
        array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 200));
//            return array[i];/
        }
        return array;
    }
}
