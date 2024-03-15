package academy.devdojo.maratonajava.exercícios.ApostilaCaelum.ExercicioContaBancaria.domain;

public class Conta {
    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private Data dataAbertura;
    private static int totalDeContas;

    public Conta() {

    }
    public Conta(String nomeTitular, int numeroConta, String agencia, double saldo, Data dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        Conta.totalDeContas = totalDeContas++;
    }

    public void sacaSaldo(double valorSacar) {
        this.saldo -= valorSacar;
    }

    public void depositarSaldo (double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
       String dados = "\nTitular: " + this.nomeTitular;
        dados += "\nNumero conta: " + this.numeroConta;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de abertura: " + dataAbertura.dataFormatada();
       return dados;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

}
