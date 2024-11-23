package bai6;

public class Test {
    public static void main(String[] args) {
        PartTimeEmployee pte = new PartTimeEmployee();
        System.out.println("Nhap thong tin: ");
        pte.nhap();
        pte.setName("Ambatukam");
        System.out.println("Ten: " + pte.getName());
        pte.setAge(19);
        System.out.println("Tuoi: "+ pte.getAge());
        
        System.out.println("Thong tin: " + pte.toString());
    }
}
