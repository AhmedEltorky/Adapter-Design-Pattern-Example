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
public class QuadrantShape implements interfaces.IQuadrantShape {
    
    private double width, length;
    
    public QuadrantShape(double width, double length) {
        this.setWidth(width);
        this.setLength(length);
    }
    
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getLength() {
        return this.length;
    }
    
    @Override
    public double getWidth() {
        return this.width;
    }
    
    @Override
    public double quadrantShapeleArea() {
        return (this.getLength() * this.getWidth());
    }
    
    @Override
    public double quadrantShapePerimeter() {
        return (this.getLength() + this.getWidth()) * 2;
    }
    
    @Override
    public void printArea() {
        System.out.println("The shape area = " + quadrantShapeleArea());
    }
    
    @Override
    public void printPerimeter() {
        System.out.println("The shape perimeter = " + quadrantShapePerimeter());
    }
    
}
