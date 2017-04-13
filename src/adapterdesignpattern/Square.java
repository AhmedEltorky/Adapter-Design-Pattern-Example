/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdesignpattern;

/**
 *
 * @author eng-torky
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
    
    public void printPerimeter(){
        System.out.println("The square perimeter = " + this.squarePerimeter(edge));
    }

}
