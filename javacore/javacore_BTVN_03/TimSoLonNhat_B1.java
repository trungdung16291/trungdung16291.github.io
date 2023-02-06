import java.util.Scanner;

public class TimSoLonNhat_B1 {
    public static void main(String[] args) {
        System.out.println("nhập n :");
        int n = new Scanner(System.in).nextInt();

        int max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("mời nhập số thứ " + i + ":");
            int x = new Scanner(System.in).nextInt();
            if (x > max) max = x;
        }
        System.out.println("số lớn nhất là :" + max);
    }

}

