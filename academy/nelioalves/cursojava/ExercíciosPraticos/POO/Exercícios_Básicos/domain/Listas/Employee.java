package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.Listas;

public class Employee {
        private Integer id;
        private String name;
        private Double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
            salary += (salary * percentage / 100.0);
        }
    }

