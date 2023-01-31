public class Cube extends ThreeDimensionalShape {

    public double edge;

    public Cube(double edge){
        if (edge <= 0 )
            throw new IllegalArgumentException(
                    "edge must be greater than 0");
        setEdge(edge);
    }

    //set edge
    public void setEdge(double edge){
        this.edge = edge;
    }
    //get edge
    public double getEdge(){
        return edge;
    }
    //overrides getArea from Shape, returns area of Cube
    @Override
    public double getArea(){
        return Math.pow((6 * getEdge()), 2);
    }
    public double getVolume(){
        return Math.pow(getEdge(), 3);
    }
}
