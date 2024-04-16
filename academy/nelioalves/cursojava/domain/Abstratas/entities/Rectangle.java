package academy.nelioalves.cursojava.domain.Abstratas.entities;

import academy.nelioalves.cursojava.domain.Abstratas.Enum.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    @Override
    public double area() {
        return width * height;
    }

    public Rectangle(Color color, Double height, Double widhth) {
        super(color);
        this.height = height;
        this.width = widhth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
