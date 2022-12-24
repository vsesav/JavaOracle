package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Skip>>>");
        char[] arr = {'a', 'b', 'c'};
        Print pr = new Print(arr);
        pr.print();

    }

}

class Print {
    char[] listOfChar;
    public Print(char[] listOfChar) {
        this.listOfChar = listOfChar;
    }
    void print() {
        for (char ch: listOfChar) {
            System.out.print(Character.toUpperCase(ch) + " ");
            System.out.println(Character.toLowerCase(ch));
        }
    }
}
