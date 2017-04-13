/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdesignpattern;

import adapterdesignpattern.adapter.SquareAdapter;
import interfaces.IQuadrantShape;

/**
 *
 * @author eng-torky
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square sq = new Square(4);
        IQuadrantShape sqAd = new SquareAdapter(sq);
        IQuadrantShape shape = new QuadrantShape(3, 4);

        System.out.println("Square:");
        sq.printSquareArea();
        sq.printPerimeter();
        System.out.println("*********************");

        System.out.println("Square With Adapter:");
        sqAd.printArea();
        sqAd.printPerimeter();
        System.out.println("*********************");

        System.out.println("Quadrant Shape:");
        shape.printArea();
        shape.printPerimeter();
        System.out.println("*********************");
    }

}
