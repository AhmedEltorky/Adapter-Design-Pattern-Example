package interfaces;

/**
 *
 * @author Ahmed El-Torky
 */
public interface IQuadrantShape {

    public void setWidth(double width);

    public void setLength(double length);

    public double getLength();

    public double getWidth();

    public double quadrantShapeleArea();

    public double quadrantShapePerimeter();

    public void printArea();

    public void printPerimeter();
}
