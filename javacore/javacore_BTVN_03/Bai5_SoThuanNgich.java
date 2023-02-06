import java.util.Scanner;

public class Bai5_SoThuanNgich {
    public static void main(String[] args) {
        System.out.println("Nhập số cần kiểm tra :");

        int n = new Scanner(System.in).nextInt();
        int m = 0;
        int x;
        x = n;
        for (; n != 0; n /= 10) {
            int z = n % 10;
            m = m * 10 + z;
        }
        if (x == m) {
            System.out.println(x + " là số thuận nghịch");
        } else {
            System.out.println(x + " không là số thuận nghịch");
        }
    }
}
