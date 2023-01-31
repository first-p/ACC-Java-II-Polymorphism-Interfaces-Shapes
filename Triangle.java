public class Triangle extends Shape{

    public double base;
    public double height;

    public Triangle(double base, double height){
        if (base <= 0 )
            throw new IllegalArgumentException(
                    "base must be greater than 0");
        setBase(base);

        if (height <= 0 )
            throw new IllegalArgumentException(
                    "height must be greater than 0");
        setHeight(height);
    }

    //set base
    public void setBase(double base){
        this.base = base;
    }
    //get Base
    public double getBase(){
        return base;
    }
    //set height
    public void setHeight(double height){
        this.height = height;
    }
    //get height
    public double getHeight(){
        return height;
    }
    //override getArea from Shape, returns area of Triangle
    @Override
    public double getArea(){
        return 0.5 * (getBase() * getHeight());
    }
}
