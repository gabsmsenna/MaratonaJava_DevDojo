package academy.nelioalves.cursojava.domain.KInterfaces.Example2.model;

import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Enum.Color;
import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Interfaces.Shape;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
