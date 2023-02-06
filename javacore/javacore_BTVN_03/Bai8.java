import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println("nhập vào chiều dài :");
        int a = new Scanner(System.in).nextInt();
        System.out.println("nhập vào chiều rộng :");
        int b = new Scanner(System.in).nextInt();
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                if (i == 0 || i == 3) {
                    System.out.print("* ");
                } else if (i == 1 && j == 0 || i == 2 && j == 0) {
                    System.out.print("* ");
                } else if (i == 1 && j == 4 || i == 2 && j == 4) {
                    System.out.print("      *");
                }
            }
            System.out.println();
        }
    }
}
