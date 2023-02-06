import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println("nhập vào chiều dài :");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhập vào chiều rộng :");
        int b = new Scanner(System.in).nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
