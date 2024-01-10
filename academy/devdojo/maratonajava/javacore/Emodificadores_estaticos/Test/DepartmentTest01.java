package academy.devdojo.maratonajava.javacore.Emodificadores_estaticos.Test;

import academy.devdojo.maratonajava.javacore.Emodificadores_estaticos.Domain.Deparment;

public class DepartmentTest01 {
    public static void main(String[] args) {
        Deparment dpt1 = new Deparment("Admin");
        System.out.println(Deparment.numberOfWorker);
        Deparment dpt2 = new Deparment("Finance");
        System.out.println(Deparment.numberOfWorker);
        Deparment dpt3 = new Deparment("Software");
        System.out.println(Deparment.numberOfWorker);
    }
}
