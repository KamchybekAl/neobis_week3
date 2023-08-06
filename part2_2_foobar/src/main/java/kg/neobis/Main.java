package kg.neobis;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Foobar foobar = new Foobar();
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        foobar.foobar(num);
        sc.close();
    }
}