package adapterdesignpattern;

/**
 *
 * @author Ahmed El-Torky
 */
public class Square {

    private double edge;

    public Square(double edge) {
        this.setEdge(edge);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double squareArea(double edge) {
        return (this.getEdge() * this.getEdge());
    }

    public double squarePerimeter(double edge) {
        return (this.getEdge() * 4);
    }

    public void printSquareArea() {
        System.out.println("The square area = " + this.squareArea(edge));
    }
    
    public void printSquarePerimeter(){
        System.out.println("The square perimeter = " + this.squarePerimeter(edge));
    }

}
