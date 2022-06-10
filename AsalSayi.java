package Metotlar;

import java.util.Scanner;

public class AsalSayi {

    static void f(int x, int i) {

        if (x == i) {
            System.out.println(x + " asal sayıdır.");
            return;
        } else if (x <= 1) {
            System.out.println(x + " asal değildir. 2'den küçük asal sayı yoktur.");
            return;
        } else if (x % i == 0) {
            System.out.println(x + " asal değildir. " + i + " ile bölünür.");
            return;
        }
        f(x, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Asal olup olmadığını sorgulamak istediğiniz sayıyı giriniz : ");
            int x = scan.nextInt();
            f(x, 2);
        }
    }
}
