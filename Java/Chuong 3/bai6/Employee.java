package bai6;
import java.util.Scanner;

public class Employee extends Person {
    private String dateHired;

    // Constructor mặc định
    public Employee() {
    }

    // Constructor dateHired
    public Employee(String dateHired) {
        this.dateHired = dateHired;
    }

    // Constructor kế thừa từ Person và dateHired
    public Employee(String dateHired, String name, int age, char gender) {
        super(name, age, gender);
        this.dateHired = dateHired;
    }

    // Phương thức set, get
    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    // Phương thức nhập thông tin nhân viên
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        // Gọi phương thức nhập từ lớp cha (Person)
        super.nhap();
        // Nhập thêm thuộc tính ngày vào làm
        System.out.print("Nhập ngày vào làm: ");
        dateHired = sc.nextLine();
    }

    // Phương thức toString, Override
    @Override
    public String toString() {
        return super.toString() + " Employee{" + "dateHired='" + dateHired + '\'' + '}';
    }
}
