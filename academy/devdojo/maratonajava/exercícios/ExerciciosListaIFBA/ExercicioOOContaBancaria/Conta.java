package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.ExercicioOOContaBancaria;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataDeAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void deposita (double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento () {
        return this.saldo * 0.1;
    }

    public String exibindoDadosImpressao() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", dataDeAbertura='" + dataDeAbertura + '\'' +
                '}';
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
}
