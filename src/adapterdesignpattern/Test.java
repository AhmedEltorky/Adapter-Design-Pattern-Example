package adapterdesignpattern;

import adapterdesignpattern.adapter.SquareAdapter;
import interfaces.IQuadrantShape;

/**
 *
 * @author Ahmed El-Torky
 */
public class Test {

    public static void main(String[] args) {
        Square sq = new Square(4);
        IQuadrantShape sqAd = new SquareAdapter(sq);
        IQuadrantShape shape = new QuadrantShape(3, 4);

        System.out.println("Square:");
        sq.printSquareArea();
        sq.printSquarePerimeter();
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
