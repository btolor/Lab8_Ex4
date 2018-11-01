package Ex_4;

import java.util.Scanner;

public class test {
    //Test Class Scanner object...
    static Scanner scan = new Scanner(System.in);
    
    //Test Class Method...
    //The Radius method prompts the user to input the radius...
    public static double radius(){
        double r;
        System.out.print("Enter the circle's radius: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Invalid entry. Try Again!");
        }
        r = scan.nextDouble();
        System.out.println();
        return r;
    }
    //X-Coordinate method prompts the user to input the x-coordinate...
    public static double xCoordinate(){
        double x;
        System.out.print("Enter the X-coordinates: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Invalid entry. Try Again!");
        }
        x = scan.nextDouble();
        System.out.println();
        return x;
    }
    //Y-Coordinate method prompts the user to input the y-coordinate...
    public static double yCoordinate(){
        double y;
        System.out.print("Enter the Y-coordinates: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Invalid entry. Try Again!");
        }
        y = scan.nextDouble();
        System.out.println();
        return y;
    }
    
    public static void main(String[] args) {
        //Main method variables...
        double radius, x, y;
        radius = radius();
        x = xCoordinate();
        y = yCoordinate();
        Circle cir = new Circle(x, y, radius);
        cir.radius();
        cir.area();
        cir.circumference();
        
    }
    
}
