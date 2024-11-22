package bai3;
import java.io.*;
public class Test {
    public static void main(String[] args) {
        // Tạo 2 đối tượng sinh viên
        Student sv1 = new Student("001", "Nguyen Van A", "01/01/2005", "Nam");
        Student sv2 = new Student("002", "Tran Thi B", "15/05/2002", "Nữ");

        // Ghi vào file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            oos.writeObject(sv1);
            oos.writeObject(sv2);
        }
        catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc từ file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            System.out.println("Dữ liệu từ file:");
            Student s1 = (Student) ois.readObject();
            Student s2 = (Student) ois.readObject();
            System.out.println(s1);
            System.out.println(s2);
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

