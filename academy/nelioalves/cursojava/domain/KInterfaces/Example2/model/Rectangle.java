package academy.nelioalves.cursojava.domain.KInterfaces.Example2.model;

import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Enum.Color;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
