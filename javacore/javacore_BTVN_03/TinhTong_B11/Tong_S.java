package TinhTong_B11;

import java.util.Scanner;

public class Tong_S {
    public static void main(String[] args) {
        System.out.println("nhập số : ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println("kết quả = " + sum);
    }

}

