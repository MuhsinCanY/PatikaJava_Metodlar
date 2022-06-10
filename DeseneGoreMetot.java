package Metotlar;
import java.util.Scanner;
public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Desenini oluşturmak istediğiniz sayıyı giriniz : ");
        int x = scan.nextInt();
        f(x);
    }

    static void f(int x){
        int i,j;
        while(x>0){
            for (i = x; i > 0; i -= 5) {
                System.out.println(i);
                j = i;
            }
            for (j = i; j <= x; j += 5) {
                System.out.println(j);
            }
        }
    }

}
