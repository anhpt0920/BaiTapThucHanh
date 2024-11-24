package bai14;

public class Test {
    public static void main(String[] args) {
        CNKSP cnksp = new CNKSP();
        System.out.println("Nhap CNKSP: ");
        cnksp.nhapThongTin();
        System.out.println("Nhan CNTCN: ");
        CNTCN cntcn = new CNTCN();
        cntcn.nhapThongTin();
        System.out.println("CNKSP: " + cnksp.toString());
        System.out.println("CNTCN: " + cntcn.toString());
    }
}
