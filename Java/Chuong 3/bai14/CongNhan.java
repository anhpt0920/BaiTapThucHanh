package bai14;

import java.util.Scanner;

public abstract class CongNhan {
    protected String hoTen;
    protected String diaChi;
    protected String loaiCN;

    public CongNhan(String hoTen, String diaChi, String loaiCN) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCN = loaiCN;
    }

    public CongNhan() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiCN() {
        return loaiCN;
    }

    public void setLoaiCN(String loaiCN) {
        this.loaiCN = loaiCN;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ho va ten: "); hoTen = sc.nextLine();
        System.out.printf("Dia chi: "); diaChi = sc.nextLine();
        System.out.printf("Loai cong nhan: "); loaiCN= sc.nextLine();
    }
    public abstract double tinhLuong();
    @Override
    public String toString() {
        return "CongNhan{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiCN=" + loaiCN + tinhLuong() + '}';
    }
}
