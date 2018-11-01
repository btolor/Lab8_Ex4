
package Ex_4;

public class Circle extends Point{
    //Circle Class Variables...
    private double area, circumference,radius;
    private String center;
    
    //Circle Class constructor...
    /*
    The constructor method take in three parameters.
    The first two parameters are used to execte the 
    enbeded Point class super method constructor and 
    the last parameter is used to set the Circle 
    class radius...
    */
    public Circle(double xCoordinate, double yCoordinate, double radius) {
        super(xCoordinate, yCoordinate);
        this.radius = radius;
    }
    
    //Circle Class Methods...
    //Getters and Setters...

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }
    
    //Circle Class Process Metohds...
    /*
    This method prints the radius of 
    the Circle Class's object...
    */
    public void radius(){
        System.out.println("The circle's radius is: " + getRadius());
    }
    /*
    This method calculates and prints
    the area of the Circle Class's 
    object...
    */
    public void area(){
        double a = Math.PI * (Math.pow(getRadius(), 2));
        setArea(a);
        System.out.println("The circle's area is: " + getArea());
    }
    /*
    This method calculates and prints
    the circumference of the Circle
    Class's object...
    */
    public void circumference(){
        double c = 2 * Math.PI * getRadius();
        setCircumference(c);
        System.out.println("The circle's circumference is: " + getCircumference());
    }
}
