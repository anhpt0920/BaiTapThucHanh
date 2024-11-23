package bai4;

import java.util.Scanner;

public class BenhNhan extends Nguoi{
    private String tienSu;
    private String chanDoan;
    private BenhVien benhvien;

    public BenhNhan() {
    }

    public BenhNhan(String tienSu, String chanDoan, BenhVien benhvien) {
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhvien = benhvien;
    }

    public BenhNhan(String tienSu, String chanDoan, BenhVien benhvien, String ten, int tuoi, char gioiTinh) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhvien = benhvien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChuanDoan() {
        return chanDoan;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public BenhVien getBenhvien() {
        return benhvien;
    }

    public void setBenhvien(BenhVien benhvien) {
        this.benhvien = benhvien;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.printf("nhap tien su: "); tienSu = sc.nextLine();
        System.out.printf("nhap chan doan: "); chanDoan = sc.nextLine();
        System.out.printf("nhap benh vien\n");
        BenhVien benhvien = new BenhVien();
        benhvien.nhap();
        this.benhvien = benhvien;
    }

    @Override
    public String toString() {
        return "BenhNhan{" + super.toString()+ "tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhvien=" + benhvien.toString() + '}';
    }
    
}
