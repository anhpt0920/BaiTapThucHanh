package bai1;
import java.io.*;
import java.util.Scanner;
public class TextFile {
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
    // Ghi vào file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("exp.txt"))) {
        writer.write(str + "\n");
        writer.write(c + "\n");
        writer.write(num + "\n");
        writer.write(d + "\n");
    } 
    catch (IOException e) {
        System.out.println("Lỗi khi ghi file: " + e.getMessage());
    }
    //Đọc dữ liệu từ file
    try (BufferedReader reader = new BufferedReader(new FileReader("exp.txt"))) {
        System.out.println("Dữ liệu từ file:");
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } 
    catch (IOException e) {
        System.out.println("Lỗi khi đọc file: " + e.getMessage());
    }
    }
}
