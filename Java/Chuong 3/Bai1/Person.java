package Bai1;
import java.util.Scanner;
public class Person {
    private String name;
    private String dob;
    private String pob;
    private char gender;
    private String email;
    private String phone;

    public Person()[
    ]

    public Person(String name, String dob, String pob, char gender, String email, String phone0) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    // Phương thức setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhobe(String phone) {
        this.phone = phone;
    }

    // Phương thức getter
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getPob() {
        return pob;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    //Phương thức Override
    @Override
    public String toString() {
        return "ten: " + name + " ,ngay sinh: " + dob + " ,noi sinh: " + pob + " ,gioi tinh: " + gender
                + ", email lien lac: " + email + " ,so dien thoai: " + phone;
    }
    //Nhập thông tin cho sơ đồ
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten: ");
        name = sc.nextLine();
        System.out.printf("nhap ngay sinh: ");
        dob = sc.nextLine();
        System.out.printf("nhap noi sinh: ");
        pob = sc.nextLine();
        System.out.printf("nhap gioi tinh: ");
        gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.printf("nhap email: ");
        email = sc.nextLine();
        System.out.printf("nhap so dien thoai: ");
        phone = sc.nextLine();
    }
}
