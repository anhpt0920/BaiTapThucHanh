package ba10;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhap hoc vien DH");
        HocVienDH  hvdh = new HocVienDH();
        hvdh.nhapThongTin();
        System.out.println("Nhap hoc vien LT");
        HocVienLT hvlt = new HocVienLT();
        hvlt.nhapThongTin();
        HocVien hv1 = hvdh;
        HocVien hv2 = hvlt;
        System.out.println("Thong tin hoc vien DH: " + hv1.inThongTin());
        System.out.println("Thong tin hoc vien LT: " + hv2.inThongTin());
    }
}
