import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("nhập số n :");

        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <=n ; ++i) {
            for (int j = 1; j <=i ; ++j) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
