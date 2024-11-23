package Bai7;
import java.util.Scanner;
public class ResizableCircle extends Circle implements Resizable{
    public Resizable (double radius){
        super(radius);
    }

    @Override
    public double resize(int percent){
        Scanner sc = new.Scanner(System.in);
        double newRad = radius+radius*percent/100;

        return newRad;
    }
}