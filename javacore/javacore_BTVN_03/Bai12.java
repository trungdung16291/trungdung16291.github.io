import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        System.out.println("nhập số n :");
        int n = new Scanner(System.in).nextInt();
        System.out.println("nhập số m :");
        int m = new Scanner(System.in).nextInt();
        int count = 0;
        if (m < 0 || n < 0) {
            System.out.println("sô nhập vào không phải số nguyên dương");
        }
        else if (m == 0 && n == 0) {
            System.out.println("không có số nào");
        } else if (m == n) {
            int temp = (int) Math.sqrt(n);
            if (temp * temp == n) {
                System.out.println("đây là số chính phương : " + n);
                count++;
            }
        } else if (m > n) {
            for (int i = n; i <= m; i++) {
                if (Math.sqrt(i) * Math.sqrt(i) == i) {
                    System.out.println("số chính phương là :" + i);
                    count++;

                }
            }
        } else if (m < n) {
            for (int i = m; i <= n; i++) {
                if (Math.sqrt(i) * Math.sqrt(i) == i) {
                    System.out.println("số chính phương là :" + i);
                    count++;

                }
            }
        }
        System.out.println("tổng số chính phương là : " + count);
    }
}
