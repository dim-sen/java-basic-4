package dimsen.method;

import java.util.Scanner;

public class Index {
    public int value;
    public char temp;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Nilai Anda: ");
        value = scanner.nextInt();
    }

    public void index(int value) {
        if (value > 80) {
            temp = 'A';
        } else if (value > 60) {
            temp = 'B';
        } else if (value > 40) {
            temp = 'C';
        } else if (value > 20) {
            temp = 'D';
        } else {
            temp = 'E';
        }
    }

    public void output() {
        System.out.println();
        System.out.println("Result: ");
        System.out.println("Nilai Anda: " + value);
        System.out.println("Index Anda: " + temp);
    }
}