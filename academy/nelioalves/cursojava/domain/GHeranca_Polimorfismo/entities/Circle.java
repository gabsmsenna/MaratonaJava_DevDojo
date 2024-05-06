package academy.nelioalves.cursojava.domain.Abstratas.entities;

import academy.nelioalves.cursojava.domain.Abstratas.Enum.Color;

public class Circle extends Shape{

    private Double radius;

    @Override
    public double area() {
        return 3.14 * (radius * radius);
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
