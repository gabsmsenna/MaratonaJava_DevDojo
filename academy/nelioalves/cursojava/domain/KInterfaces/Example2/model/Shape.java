package academy.nelioalves.cursojava.domain.KInterfaces.Example2.model;

import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Enum.Color;

public class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public double area() {
        return 0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
