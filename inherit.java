import java.util.Scanner;
    class shape{
    public double getarea(){
        return 0;
    }
}
  class circle extends shape{
    double radius;
    circle(double r){
        radius=r;
    }
    public double getarea(){
        return Math.PI*radius*radius;
    }
  }
  class rectangle extends shape{
    double length,width;
    rectangle(double l, double w){
        length=l;
        width=w;
    }
    public double getarea(){
        return length*width;
      }
  }
  class triangle extends shape{
    double base,height;
    triangle(double a, double c){
        base b;
        height h;
    }
    public double getarea(){
        return 0.5*base*height;
    }
  }
  class inheritance{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius of circle");
    double r = sc.nextDouble();
    circle c = new circle(r);
    System.out.println("Circle Area:" + c.getarea());
    System.out.println("Enter length,width of rectangle:");
    double l = sc.nextDouble();
    double w = sc.nextDouble();
    rectangle rect = new rectangle(l, w);
    System.out.println("Rectangle area:" + rect.getarea());
    System.out.println("Enter base of triangle:");
    double base = sc.nextDouble();
    System.out.println("Enter height of triangle:");
    double height = sc.nextDouble();
    triangle t = new triangle(base, height);
    System.out.println("Triangle area:" + t.getarea());
}
  }

