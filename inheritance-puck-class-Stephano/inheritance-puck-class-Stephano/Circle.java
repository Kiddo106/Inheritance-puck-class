/**
 * Circle class.
 */
public class Circle {
  
  private static final double PI = 3.14;
  private double radius;
  
  /**
   * constructor
   * pre: none
   * post: A Circle object created. Radius initialized to 1.
   */
  public Circle() {
    radius = 1; //default radius
  }
  
  /**
   * constructor
   * pre: none
   * post: A Circle object created. Radius initialized to r.
   */
  public Circle(double r) {
    radius = r; //default radius
  }
  
  /**
   * Changes the radius of the circle.
   * pre: none
   * post: Radius has been changed.
   */
  public void setRadius(double newRadius) {
    radius = newRadius;
  }
  
  /*
   * Calculates the area of the circle.
   * pre: none
   * post: The area of the circle has been returned.
   */
  public double area() {
    double circleArea;
    circleArea = PI * radius * radius;
    return(circleArea);
  }
  
  /*
   * Returns the radius of the circle.
   * pre: none
   * post: The radius of the circle has been returned.
   */
  public double getRadius() {    
    return radius; 
  }
}