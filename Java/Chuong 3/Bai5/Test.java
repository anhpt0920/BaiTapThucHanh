package Bai5;

public class Test {
    public static void main(String[] args) {
        SinhVien sinhvien = new SinhVien();
        System.out.println("Nhap thong tin sinh vien");
        sinhvien.nhap();
        System.out.println("Thong tin sinh vien: " + sinhvien.toString());
    }
}
