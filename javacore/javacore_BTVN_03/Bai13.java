import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println("nhập số n :");
        long n = new Scanner(System.in).nextLong();
        long sum = 0;
        for (int i = 7; i < n; i += 7) {
            sum += i;
        }
        System.out.println(sum);
    }
}
