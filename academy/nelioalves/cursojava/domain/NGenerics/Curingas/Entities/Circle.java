package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.NGenerics.Curingas.Entities;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
