package hw3.part6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Masive1 masive1 = new Masive1(10);
        System.out.println(Arrays.toString(masive1.creator()));

        Masive2 masive2 = new Masive2(20, 20 );
        System.out.println(Arrays.toString(masive2.creator()));
    }
}
