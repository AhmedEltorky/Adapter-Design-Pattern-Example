package adapterdesignpattern.adapter;

import adapterdesignpattern.Square;
import interfaces.IQuadrantShape;

/**
 *
 * @author Ahmed El-Torky
 */
public class SquareAdapter implements IQuadrantShape {

    Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void setWidth(double width) {
        square.setEdge(width);
    }

    @Override
    public void setLength(double length) {
        square.setEdge(length);
    }

    @Override
    public double getLength() {
        return square.getEdge();
    }

    @Override
    public double getWidth() {
        return square.getEdge();
    }

    @Override
    public double quadrantShapeleArea() {
        return square.squareArea(square.getEdge());
    }

    @Override
    public double quadrantShapePerimeter() {
        return square.squarePerimeter(square.getEdge());
    }

    @Override
    public void printArea() {
        square.printSquareArea();
    }

    @Override
    public void printPerimeter() {
        square.printSquarePerimeter();
    }
}
