import java.util.Scanner;

public class ChanLe_B14 {
    public static void main(String[] args) {
        System.out.println("nhập số n : ");
        int s = 0;
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i += 2) {
            if (n % i == 0) {
                s+=i;
                System.out.println("các số chẵn là : "+s);
            }
        }

    }
}
