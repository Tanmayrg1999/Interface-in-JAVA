package assignment6;
import java.util.Scanner;
import java.lang.Math; 
public class Assignment6 {
    public static void main(String[] args) {
           String input;
           System.out.println("Enter comma-seperated radii ; If You wanna work with circle enter first Radius and The second radius be 0");
           Scanner sc=new Scanner(System.in);
           input=sc.nextLine();
           String []array=input.split(",");
           int num1,num2;
           num1=Integer.parseInt(array[0]);
           num2=Integer.parseInt(array[1]);
           int d1,d2;
           d1=num1;
           d2=num2;
           if(d1==0 && d2==0)
           {
               System.out.println("ENTER A VALID INPUT");
           }
           if( d2==0)
           {
              Shape c=new Circle();
              System.out.print("Perimeter of circle is: ");
              System.out.println(String.format("%.3f",c.perimeterCalculation(d1,d2)));
              System.out.print("area of circle is: ");
              System.out.println(String.format("%.3f",c.areaCalculation(d1, d2)));
           }
           else
           {
              Shape e=new Eclipse();
              System.out.print("Perimeter of eclipse is: ");
              System.out.println(String.format("%.3f",e.perimeterCalculation(d1,d2)));
              System.out.print("Area of Eclipse is: ");
              System.out.println(String.format("%.3f",e.areaCalculation(d1, d2)));  
           }
    }    
}
interface Shape{
    public double perimeterCalculation(double r1,double r2);
    public double areaCalculation(double r1,double r2);
}
class Circle implements Shape{
    public double perimeterCalculation(double r1,double r2){
        return 2*3.14*r1;
    }

public double areaCalculation(double r1,double r2){
    return 3.14*r1*r1;
}
}

class Eclipse implements Shape{
    public double perimeterCalculation(double r1,double r2){
        return 2*3.14*(Math.pow((r1*r1+r2*r2)/2,1/2));
    }

public double areaCalculation(double r1,double r2){
    return 3.14*r1*r2;
}
}