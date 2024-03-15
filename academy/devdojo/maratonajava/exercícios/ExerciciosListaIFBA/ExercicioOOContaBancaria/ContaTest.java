package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.ExercicioOOContaBancaria;

public class ContaTest {
    public static void main(String[] args) {
        Conta contaGabriel = new Conta("Gabriel", 20,"NU",50000, "01/01/2024");
        Conta contaDaniel = new Conta("Daniel", 21, "INTER", 40000, "01/02/2024");
        
        System.out.println("--EXTRATO CONTA BANCÁRIA--");


        contaGabriel.deposita(500);

    }
}
