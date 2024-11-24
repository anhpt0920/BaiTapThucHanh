package bai10;

import java.util.Scanner;

public abstract class HocVien {
    protected String hoTen;
    protected String diaChi;
    protected String loaiCT;

    public HocVien() {
    }

    public HocVien(String hoTen, String diaChi, String loaiCT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCT = loaiCT;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ho ten: "); hoTen = sc.nextLine();
        System.out.printf("Nhap dia chi: "); diaChi = sc.nextLine();
        System.out.printf("Nhap loai CT: "); loaiCT = sc.nextLine();
    }
    public abstract double hocPhi();
    public String inThongTin(){
        return "Ho ten=" + hoTen + " ,Dia chi=" 
                + diaChi + " ,Loai chuong trinh="+loaiCT + " ,Hoc phi=" + hocPhi();
    }
}
