public class Circle extends TwoDimensionalShape {

    private double PI;
    private double radius;

    //constructor
    public Circle(double radius){
        if (radius <= 0)
            throw new IllegalArgumentException(
                    "radius must be greater than 0");
        setRadius(radius);
    }

    //set radius
    public void setRadius(double radius){
        this.radius = radius;
    }

    //get Radius
    public double getRadius(){
        return radius;
    }

    //get Diameter
    public double getDiameter(){
        return radius *2;
    }
    //overrides super getArea in Shape.java, returns area of a cirlce
    @Override
    public double getArea(){
        return Math.pow((PI * getRadius()),2);
    }


}
