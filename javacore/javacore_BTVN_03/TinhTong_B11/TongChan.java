package TinhTong_B11;

import java.util.Scanner;

public class TongChan {
    public static void main(String[] args) {
        System.out.println("nhập số n :");
        int n = new Scanner(System.in).nextInt();
        long sum = 0;
        for (int i = 2; i < n; i += 2) {
            sum += i;
        }
        System.out.println("tổng số tự nhiên chẵn = " + sum);
    }
}
