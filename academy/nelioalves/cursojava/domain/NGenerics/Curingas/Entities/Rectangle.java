package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.NGenerics.Curingas.Entities;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


}
