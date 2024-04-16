package academy.nelioalves.cursojava.domain.Abstratas.program;

import academy.nelioalves.cursojava.domain.Abstratas.Enum.Color;
import academy.nelioalves.cursojava.domain.Abstratas.entities.Circle;
import academy.nelioalves.cursojava.domain.Abstratas.entities.Rectangle;
import academy.nelioalves.cursojava.domain.Abstratas.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the numer of shapes: ");
        int num = scan.nextInt();

        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle? (r/c)? ");
            char shape = scan.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = scan.next();

            if (shape == 'r') {
                System.out.print("Width: ");
                double width = scan.nextDouble();
                System.out.println("Height: ");
                double height = scan.nextDouble();
                shapes.add(new Rectangle (Color.valueOf(color), height, width));
            } else if (shape == 'c') {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();
                shapes.add(new Circle( Color.valueOf(color), radius));
            }

        }
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
