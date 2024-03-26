package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain.OrientaçãoObjetos;

public class Conta {
    private int numConta;
    protected String nomeTitular;
    private double saldoConta;
    public boolean existeDepositoInicial = true;

    public Conta(int numConta, String nomeTitular, double depositoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        deposita(depositoInicial);
    }

    public Conta(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public double deposita(double valorDeposito) {
        return saldoConta += valorDeposito;
    }

    public double saque(double valorSaque) {
        return saldoConta -= valorSaque + 5;
    }


    @Override
    public String toString() {
        return
                "Número da conta: " + numConta +
                " Titular: " + nomeTitular +
                "Saldo: $" +
                String.format("%.2f", saldoConta);
    }

    //GETTERS E SETTERS ABAIXO


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }


}
