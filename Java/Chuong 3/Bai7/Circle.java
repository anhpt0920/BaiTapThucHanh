package Bai7;
public class Circle implements GeometricObject{
    protected double radius;

    public Circle (double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter (double radius){
        double per = 2*Math.PI*radius;
        return per;
    }

    @Override
    public double getArea (double radius){
        double area = Math.PI*radius*radius;
        return area;
    }
}