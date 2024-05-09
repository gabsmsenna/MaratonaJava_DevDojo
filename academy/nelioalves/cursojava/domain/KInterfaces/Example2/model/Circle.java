package academy.nelioalves.cursojava.domain.KInterfaces.Example2.model;

import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Enum.Color;
import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Interfaces.Shape;

public class Circle extends AbstractShape {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
