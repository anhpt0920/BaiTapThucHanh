package bai1;
public class Test {
    public static void main(String[] args){
        Person person = new Person();
        person.nhap();
        person.setName("Ambatukam");
        System.out.println("Thong tin cua: " + person.toString());
    }
}