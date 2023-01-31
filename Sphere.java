public class Sphere extends ThreeDimensionalShape{

    public double PI = 3.14159;
    public double radius;

    public Sphere(double radius){
        if (radius <= 0 )
            throw new IllegalArgumentException(
                    "radius must be greater than 0");
        setRadius(radius);
    }
    //set radius
    public void setRadius(double radius){
        this.radius = radius;
    }
    //get radius
    public double getRadius(){
        return radius;
    }
    //getDiameter
    public double getDiameter(){
        return getRadius() *2;
    }
    //overrides getArea() from Shape, return getArea
    @Override
    public double getArea(){
        return Math.pow( (4 * PI * getRadius()), 2 );
    }
    public double getVolume(){
        return Math.pow(( (4/3) * PI * getRadius()), 3);
    } 
}
