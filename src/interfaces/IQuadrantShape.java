/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author eng-torky
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
