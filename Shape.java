import java.util.Scanner;

public class Shape 
{
    private double radius, length, breadth;
    
    Shape(double radius)
    {
        this.radius = radius;
    }
    
    Shape(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius = sc.nextDouble();
        Shape circle = new Shape(radius);
        System.out.println("Area of circle:" + (Math.PI * radius * radius));
        
        System.out.println("Enter the length and breadth of rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Shape rectangle = new Shape(length, breadth);
        System.out.println("Area of rectangle:" + (length * breadth));
        
        sc.close();
    }

}