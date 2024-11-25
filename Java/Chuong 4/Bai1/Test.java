package Bai1;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a : ");
        int a = sc.nextInt();
        System.out.println("Nhập b : ");
        int b = sc.nextInt();

        try {
            if (b == 0)
                throw new Exception("Không thể chia cho 0");
            float c = (float) a / b;
            System.out.println("kq= " + c);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
