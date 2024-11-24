package Bai13;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin cua LDPT");
        LaoDongPhoThong ldpt = new LaoDongPhoThong();
        ldpt.nhapThongTin();
        System.out.println("Thong tin cua LDPT: " + ldpt.inThongTin());
        System.out.println("Nhap thong tin cua ki su");
        KiSu kisu = new KiSu();
        kisu.nhapThongTin();
        System.out.println("Thong tin cua ki su: " + kisu.inThongTin());
    }
}
