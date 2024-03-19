package academy.nelioalves.cursojava.ExercíciosPraticos.POO.Exercícios_Básicos.domain;

public class Banco {
    private int numConta;
    protected String nomeTitular;
    private double saldoConta;
    public boolean existeDepositoInicial;

    public Banco(int numConta, String nomeTitular, double depositoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = depositoInicial;
    }

    public Banco(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public double deposita(double valorDeposito) {
        return saldoConta += valorDeposito;
    }

    public double saque(double valorSaque) {
        return saldoConta -= valorSaque + 5;
    }

    public boolean isExisteDepositoInicial() {
        if (existeDepositoInicial == true) {

        }
        return false;
    }

    //GETTERS E SETTERS ABAIXO

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

}
