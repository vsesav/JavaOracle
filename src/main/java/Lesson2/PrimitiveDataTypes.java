package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        System.out.println(2+3);
        //long a = 10000000000; Так как в Java int является типом данных по умолчанию для целочисленных знаяений
        //    |
        //    |
        //    V
        long b = 10000000000L;

        //float f1 = 3.14;
        //    |
        //    |
        //    V
        float f2 = 3.14F;

        double d1 = 3.14;
        double d2 = 3.14F;

        char c1 = 'A';
        System.out.println(c1);

        char c2 = 10000;
        System.out.println(c2);

        char c3 = '\u1000';
        System.out.println(c3);

        // В десятичной
        int a1 = 60;

        // В двоичной
        int a2 = 0b111100;
        int a3 = 0B111100;

        // В восмяричной
        int a4 = 074;

        // В шеснадцатиричной
        int a5 = 0x3C;
        int a6 = 0X3C;

        System.out.println(a1 + a2 + a3 + a4 +a5 +a6);
    }
}
