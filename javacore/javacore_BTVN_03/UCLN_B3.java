import java.util.Scanner;

public class UCLN_B3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số b");
        int b = Integer.parseInt(sc.nextLine());

        int UCLN = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                UCLN = i;

        }
        System.out.println(" UCLN " + a + " va " + b + " là " + UCLN);
        System.out.println(" BCNN " + a + " va " + b + " là " + (a * b) / UCLN);


    }
}
