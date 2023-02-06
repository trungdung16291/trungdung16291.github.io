import java.util.Scanner;

public class UocSo_B2 {
    public static void main(String[] args) {
        System.out.println("nhập số n :");
        int n = new Scanner(System.in).nextInt();
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                x++;
                System.out.println(i+"");
            }

        }
        System.out.println("x có " + x + " ước số " );
    }
}
