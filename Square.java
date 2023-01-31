public class Square extends TwoDimensionalShape {
    private double edge;

    //constructor
    public Square(double edge){
        if (edge <= 0)
            throw new IllegalArgumentException(
                "edge must be greater than 0");
        setEdge(edge);
    }

    //set edge
    public void setEdge(double edge){
        this.edge = edge;
    }
    //get Edge
    public double getEdge(){
        return edge;
    }

    //Override getArea from Shape, returns area
    @Override
    public double getArea(){
        return getEdge() * getEdge();
    }
}
