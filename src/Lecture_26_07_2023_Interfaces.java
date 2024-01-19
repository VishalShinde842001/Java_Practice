import java.util.Scanner;

public class Lecture_26_07_2023_Interfaces {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.area();
        System.out.println("Enter the radius of Circle to find area :");
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle(sc.nextDouble());
        c.area();
        System.out.println("Enter the base and height to find area of triangle");
        Triangle t=new Triangle(sc.nextDouble(), sc.nextDouble());
        t.area();

    }
}
class Shape{
    void area(){
        System.out.println("Dafault method in class Shape");
    }
}
class Circle extends  Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
    @Override
    void area(){
        System.out.format("%.2f",Math.PI*r*r);
        System.out.println();
    }
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    void area(){
        System.out.println("Area of triangle having height "+height+" and base "+base+" is "+0.5*height*base);
    }
}
