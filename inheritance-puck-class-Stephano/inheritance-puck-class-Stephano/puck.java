class puck extends Disk{
 private double weight;
 private boolean standard, youth; 
 
 
 public puck() {
 super(1.5,1);
 
 weight = 1;
 setDivision();
 }
 
 public puck(double w) {
    super(1.5, 1);
    weight = w;
    setDivision();
  }
 
 public puck(double w, double radius, double thickness){
 
 super(radius ,thickness);   
    weight = w;
    setDivision();
 }
  public double getWeight() {
 return(weight);
 }
  
 public String getDivision() {
    if(standard == true)
      return "is a standard puck.";
    
    if (youth == true)
      return "is a youth puck.";
    
    return "is a non regulated puck.";
 }
 public void setDivision(){
  youth = false;
    standard = false;
    
    if (weight >= 4 && weight <= 4.5) {
      youth = true;
    }
    else if (weight >= 5 && weight <= 5.5) {
      standard = true;
    }
 
 
 }
public String toString() {
 String puckString;
 
 puckString = "The puck has weight " + getWeight() + " and division " + getDivision() + ".";
 return(puckString);
 }
  public boolean equals(Object p) {
    puck testObj = (puck)p;
    
    if (testObj.getRadius() == getRadius() 
          && testObj.getThickness() == getThickness()
          && testObj.getWeight() == weight
          && testObj.getDivision() == getDivision()) {
      return(true);
    } 
    return(false);
  }
}