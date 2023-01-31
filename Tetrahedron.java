public class Tetrahedron extends ThreeDimensionalShape{

    public double edge;

    public Tetrahedron(double edge){
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
    //override getArea from Shape, return area of Tetrahedron
    @Override
    public double getArea(){
        return Math.sqrt(Math.pow(3 * getEdge(), 2));
    }
    public double getVolume(){
        return (Math.pow(getEdge(), 3)) / 6 * Math.sqrt(2);
    }
}
