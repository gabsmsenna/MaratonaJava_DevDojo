package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.NGenerics.Curingas.Program;

import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.NGenerics.Curingas.Entities.Circle;
import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.NGenerics.Curingas.Entities.Rectangle;
import Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.NGenerics.Curingas.Entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<Shape>();
        myShapes.add(new Rectangle(3.0, 4.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(3.0));
        myCircles.add(new Circle(4.0));

        System.out.println("Total area: " + totalArea(myCircles));

        System.out.println("Total area: " + totalArea(myShapes));


    }

    public static double totalArea(List<? extends Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
