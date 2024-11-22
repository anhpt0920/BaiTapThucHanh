package bai2;
import java.io.*;
import java.util.Scanner;
public class BinaryFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi ký tự: ");
        String str = sc.nextLine();
        System.out.print("Nhập một ký tự: ");
        char c = sc.next().charAt(0);
        System.out.print("Nhập một số nguyên: ");
        int num = sc.nextInt();
        System.out.print("Nhập một số thực: ");
        double d = sc.nextDouble();

        // Ghi vào file nhị phân
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("exp.dat"))) {
            dos.writeUTF(str);
            dos.writeChar(c);
            dos.writeInt(num);
            dos.writeDouble(d);
        } 
        catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file nhị phân
        try (DataInputStream dis = new DataInputStream(new FileInputStream("exp.dat"))) {
            System.out.println("Dữ liệu từ file:");
            System.out.println(dis.readUTF());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
        }
        catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
