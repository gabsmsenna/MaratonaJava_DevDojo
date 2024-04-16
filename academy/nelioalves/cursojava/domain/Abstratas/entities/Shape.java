package academy.nelioalves.cursojava.domain.Abstratas.entities;

import academy.nelioalves.cursojava.domain.Abstratas.Enum.Color;

public abstract class Shape {
    private Color color;

    public abstract double area();

    public Shape(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
