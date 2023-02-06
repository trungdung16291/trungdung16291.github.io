import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.println("nhập số n :");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = n; k >i ; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
