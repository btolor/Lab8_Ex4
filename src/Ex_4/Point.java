
package Ex_4;

public class Point {
    
    //Private Variables...
    private double xCoordinate, yCoordinate;
    private String point;
    
    //Constructor...
    /*
    The constructor method sets the x and y coordinates 
    and and the point...
    */
    public Point(double xCoordinate,double yCoordinate) {  
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        axisPoint();
    }

    //Point Class Methods...
    //Getters & Setters...
    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
 
    //Point Class Process Methods...
    /*
    The axisPoint method sets the point string variable...
    */
    public String axisPoint(){
        String testPoint = "(" + getxCoordinate() +
                "," + getyCoordinate() +")";
        setPoint(testPoint);
        return getPoint();
    }
    /*
    This method prints the point...
    */
    public void showPoint() {
        System.out.println("The point is: " + getPoint());
    }
    /*
    This method prints the x-coordinate...
    */
    public void xCoordinate(){
        System.out.println("The x-coordinate is: " + getxCoordinate());
    }
    /*
    This method prints the y-coordinate...
    */
    public void yCoordinate(){
        System.out.println("The y-coordinate is: " + getyCoordinate());
    }
    
}
