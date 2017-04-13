/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdesignpattern.adapter;

import adapterdesignpattern.Square;
import interfaces.IQuadrantShape;

/**
 *
 * @author eng-torky
 */
public class SquareAdapter implements IQuadrantShape {

    Square sq;

    public SquareAdapter(Square sq) {
        this.sq = sq;
    }

    @Override
    public void setWidth(double width) {
        sq.setEdge(width);
    }

    @Override
    public void setLength(double length) {
        sq.setEdge(length);
    }

    @Override
    public double getLength() {
        return sq.getEdge();
    }

    @Override
    public double getWidth() {
        return sq.getEdge();
    }

    @Override
    public double quadrantShapeleArea() {
        return sq.squareArea(sq.getEdge());
    }

    @Override
    public double quadrantShapePerimeter() {
        return sq.squarePerimeter(sq.getEdge());
    }

    @Override
    public void printArea() {
        sq.printSquareArea();
    }

    @Override
    public void printPerimeter() {
        sq.printPerimeter();
    }
}
