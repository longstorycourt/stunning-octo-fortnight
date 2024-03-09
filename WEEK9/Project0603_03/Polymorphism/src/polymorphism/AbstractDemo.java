package polymorphism;

import java.text.DecimalFormat;

abstract class Shape{
    final double PHI = 22.0/7.0;
    double area;
    abstract double Area();//abstract method
}
class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double x, double y){
        length = x;
        breadth = y;
    }
    double Area(){
        return length*breadth;
    }
}
class Circle extends Shape{
    double radius;
    Circle (double r){radius = r;}
    double Area(){
        return (PHI*radius*radius);
    }
}

public class AbstractDemo {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Shape rec = new Rectangle(4.5,2.0);
        Shape cir = new Circle(5.0);

        System.out.println("The area of the rectangle: "+ df.format(rec.Area()));
        System.out.println("The area of the circle: "+df.format(cir.Area()));
    }
}
